public class ArrayDemo1{

public static void main(String[] args){
	int[][][] b = {{{1,2,3},{4,5},{6,7,8}}};
	System.out.println(b);
	System.out.println(b[0]);
	System.out.println (b.length);
	
	for(int i=0; i<b.length; i++)
	{
		for(int j=0; j<b[i].length; j++)
		{
			for(int k=0; k<b[i][j].length; k++)
			{
				System.out.print(b[i][j][k]+ " ");
			}
			System.out.println();
		}
		
	}
}
}
