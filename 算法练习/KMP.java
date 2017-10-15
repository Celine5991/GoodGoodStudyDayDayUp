public class demo
{
	public static void main(String[] args)
	{
		String str1="abaaabbababba";
		String str2="ababba";
		KMP(str1,str2);
	}
	//朴素算法
    private static void brutForce(String source, String pattern) {
       int count=0,getCount=0;
       int slen=source.length(),plen=pattern.length();
       for(int i=0;i<=slen-plen;i++)
       {
    	   count++;
    	   String str=source.substring(i, i+plen);
    	   if(str.equals(pattern)) {
    		   System.out.println("在第"+i+"个位置匹配成功");
    		   getCount++;
    	   }    	   
       }
	   System.out.println("匹配了"+count+"次；成功匹配了"+getCount+"次");
    }
  //KMP算法实现
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
        	System.out.println("\"abababbababa\"和\"ababba\"匹配成功，在第"+(i-plen+1)+"位置匹配到");
        }else
        {
        	System.out.println("匹配失败");
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