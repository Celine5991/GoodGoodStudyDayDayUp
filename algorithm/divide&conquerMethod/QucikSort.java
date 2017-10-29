
public class QucikSort {

	public static void main(String[] args) {
		int[] r= {89,5,6,8,9,1};
		System.out.println("Before sort");
		for(int x:r)
			System.out.print(x+" ");
		System.out.println();
		QuickSort(r,0,r.length-1);
		System.out.print("After sort");
		System.out.println();
		for(int x:r)
			System.out.print(x+" ");
		System.out.println();
	}
	public static void QuickSort(int r[],int s,int l)
	{
		int pivot;
		if(s<l)//notice
		{
			pivot=Partition(r,s,l);
			QuickSort(r,s,pivot-1);
			QuickSort(r,pivot+1,l);
		}
	}
	public static int Partition(int r[],int s,int l)
	{
		int i=(s+l)/2,j=l,temp;
		while(i<j)
		{
			while(i<j&&r[i]<=r[j])j--;//notice
			if(i<j)
			{
				temp=r[i];r[i]=r[j];r[j]=temp;
			}
			i=s;
			while(i<j&&r[i]<=r[j])i++;
			if(i<j)
			{
				temp=r[i];r[i]=r[j];r[j]=temp;
			}
		}
		return i;
	}
}
