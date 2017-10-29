//πÈ≤¢≈≈–ÚMergeSort
public class Practice {

	public static void main(String[] args) {
		int[] r1= {89,5,6,8,9,1},r2=new int[10];
		System.out.print("Before sort");
		System.out.println();
		for(int x:r1)
			System.out.print(x+" ");
		System.out.println();
		Merge(r1,r2,0,r1.length-1);
		System.out.print("After sort");
		System.out.println();
		for(int x:r1)
			System.out.print(x+" ");
		System.out.println();
	}
	public static void Merge(int r1[],int r2[],int s,int l)
	{
		if(s==l)return;
		else
		{
			int m=(s+l)/2;
			Merge(r1,r2,s,m);
			Merge(r1,r2,m+1,l);
			MergeSort(r1,r2,s,m,l);
			for(int x=s;x<=l;x++)
				r1[x]=r2[x];
		}
	}
	public static void MergeSort(int r1[],int r2[],int s,int m,int l)
	{
		int i=s,j=m+1,k=s;
		while(i<=m&&j<=l)
		{
			if(r1[i]<r1[j])r2[k++]=r1[i++];
			else r2[k++]=r1[j++];
		}
		while(i<=m)r2[k++]=r1[i++];
		while(j<=l)r2[k++]=r1[j++];
	}
	
}
