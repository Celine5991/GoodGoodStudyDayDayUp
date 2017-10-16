public class demo
{
	public static int used[]= {1,1,1,1,1};
	public static void main(String[] args)
	{
		int n=3;
		subsetSort(n,0);
	}
	public static void subsetSort(int n,int cur)
	{
		if(n==cur)
		{
			for(int i=0;i<n;i++)
				if(used[i]==1)
					System.out.print(i+1+" ");
			System.out.println();
			return;
		}
		used[cur]=1;subsetSort(n,cur+1);
		used[cur]=0;subsetSort(n,cur+1);
	}
}