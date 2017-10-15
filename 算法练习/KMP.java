public class demo
{
	public static void main(String[] args)
	{
		String str1="abaaabbababba";
		String str2="ababba";
		KMP(str1,str2);
	}
	//�����㷨
    private static void brutForce(String source, String pattern) {
       int count=0,getCount=0;
       int slen=source.length(),plen=pattern.length();
       for(int i=0;i<=slen-plen;i++)
       {
    	   count++;
    	   String str=source.substring(i, i+plen);
    	   if(str.equals(pattern)) {
    		   System.out.println("�ڵ�"+i+"��λ��ƥ��ɹ�");
    		   getCount++;
    	   }    	   
       }
	   System.out.println("ƥ����"+count+"�Σ��ɹ�ƥ����"+getCount+"��");
    }
  //KMP�㷨ʵ��
    private static void KMP(String source, String pattern) {
    	int i=0,j=0;
    	int next[]=new int[40];
        int slen=source.length(),plen=pattern.length();
        char[] s=source.toCharArray(),p=pattern.toCharArray();
        getNext(p,next);
        while(i<slen&&j<plen)
        {
           if(s[i]==p[j])
           {
                i++;j++;
           }else
           {
                j=next[j];
                i++;
           }
        }
        if(j==plen)
        {
        	System.out.println("\"abababbababa\"��\"ababba\"ƥ��ɹ����ڵ�"+(i-plen+1)+"λ��ƥ�䵽");
        }else
        {
        	System.out.println("ƥ��ʧ��");
        }
        
     }
     private static void getNext(char[] p,int next[]) {
    	 int i,j=1,len;
    	 next[0]=0;
    	 while(j<p.length)
    	 {
    		 for(len=j-1;len>=1;len--)
    		 {
    			 for(i=0;i<len;i++)
    				 if(p[i]!=p[j-len+i])break;
    			 if(i==len)
    			 {
    				 next[j]=len;break;
    			 }
    		 }
    		 if(len<1)next[j]=0;
    		 j++;
    	 }
     }
}