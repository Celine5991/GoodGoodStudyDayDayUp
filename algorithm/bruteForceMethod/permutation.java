public class demo
{
	public static void main(String[] args)
	{
		int n=5,r[] = new int[n];
		permutation(n,0,r);
	}
	public static void permutation(int n,int cur,int[] r)
	{
		if(n==cur)
		{
			for(int i=0;i<n;i++)
					System.out.print(r[i]+" ");
			System.out.println();
			return;
		}
		for(int i=1;i<=n;i++)
		{
			int ok=1;
			for(int j=0;j<cur;j++)
				if(r[j]==i)ok=0;
			if(ok==1)
			{
				r[cur]=i;
				permutation(n,cur+1,r);
			}
			
		}
		
	}
}