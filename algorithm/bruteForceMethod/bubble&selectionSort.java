public class demo
{
	public static void main(String[] args)
	{
		int[] arr= {5,20,35,6,10,25};
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		System.out.println();
		arr=bubbleSort(arr);
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		System.out.println();
		
	}
	public static int[] selectionSort(int[] arr)//ѡ������Ϊ����length-1�˱Ƚϣ���ÿ����С�������������±���
	{
		int i,j,index,temp;
		for(i=0;i<arr.length-1;i++)
		{
			index=i;
			for(j=i+1;j<arr.length;j++)
				if(arr[j]<arr[index])index=j;
			if(index!=i)
			{
				temp=arr[i];arr[i]=arr[index];arr[index]=temp;
			}
		}
		return arr;
	}
	public static int[] bubbleSort(int[] arr)//��������Ϊ����length-1�˱Ƚϣ���ÿ������������ϸ��±���
	{
		int i,j,index,temp;
		for(i=arr.length-1;i>0;i--)
		{
			for(j=0;j<i;j++)
			{
				index=j+1;
				if(arr[j]>arr[index])
				{
					temp=arr[index];
					arr[index]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr;
	}
}