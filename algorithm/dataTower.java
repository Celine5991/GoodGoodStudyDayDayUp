
public class demo
{
	public static void main(String[] args)
	{
		int r[][]= {{5},{6,8},{9,6,8}};
		int relasut=dataTower(r);
	}
	public static int dataTower(int tower[][])
	{
	  int height=tower.length;
	  int len=tower[height-1].length;
	  int resultTower[][]=new int[height][len];
	  int path[][]=new int[height][len];
	  for(int x=0;x<len;x++)
		  resultTower[height-1][x]=tower[height-1][x];
	  for(int i=height-2;i>=0;i--)
		  for(int j=0;j<=i;j++)
		  {
			  if(resultTower[i+1][j]>resultTower[i+1][j+1])
			  {
				  resultTower[i][j]=tower[i][j]+resultTower[i+1][j];
				  path[i][j]=j;
			  }else
			  {
				  resultTower[i][j]=tower[i][j]+resultTower[i+1][j+1];
				  path[i][j]=j+1;
			  }
		  }
	  System.out.println("The maxsum is "+resultTower[0][0]);
	  System.out.print("The path of it is "+tower[0][0]);
	  int j=path[0][0];
	  for(int x=1;x<height;x++)
	  {
		 System.out.print("-"+tower[x][j]);
		 j=path[x][j];
	  }
	  return resultTower[0][0];
	}
}
