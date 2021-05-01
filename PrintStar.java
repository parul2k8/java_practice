public class PrintStar {

	public static void main(String[] args)
	{
		System.out.println("enter the number");
		java.util.Scanner scn = new java.util.Scanner(System.in);
		int n = scn.nextInt();
		for(int i=n;i>0;i--)
		{
			for(int j=i;j>0;j--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}        
		
	}
}
