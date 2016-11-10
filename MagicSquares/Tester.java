import java.util.Scanner;


public class Tester {

	public static void main(String[] args) {
		int square[][]=new int[4][4];
		
		for(int a=0;a<4;a++)
		{
			System.out.println("Please enter four integers:");	
			for(int b=0;b<4;b++)
			{
			
			Scanner intTake=new Scanner(System.in);
			square[a][b]=intTake.nextInt();
			}
		}
		MagicCheck aa=new MagicCheck();
		System.out.println(aa.magicChecker(square));
		for(int c=0;c<4;c++)
		{
			for(int d=0;d<4;d++)
			{
			System.out.print(square[c][d]+"\t");
			}
			System.out.println();
		}
	}

}
