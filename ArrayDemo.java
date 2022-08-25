public class ArrayDemo{

public static void main(String[] args){

int[][] a = {{12,13,14},{23,24,25}};

for(int i=0;i<a.length;i++)
{
	for (int j=0; j<a[i].length; j++)
	{
		System.out.print(a[i][j] + " ");
	}
	System.out.println();
}
}
}
