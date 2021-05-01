class CenturyYear
{
	public static void main(String[]args)
	{ 
	int year;
	int century;
	java.util.Scanner scn = new java.util.Scanner(System.in);
	System.out.println("Enter the year");
	year = scn.nextInt();
	
	CenturyYear A = new CenturyYear();
	System.out.println("Its " + A.CenturyFromYear(year) + " century");
	}


public int CenturyFromYear(int year)
{
 if (year % 100 == 0)
	return year/100 ;
	
else return year/100 + 1;
}
}