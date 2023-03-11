import java.util.Scanner;
class voting{

		public static void main(String args[])
	{
		Scanner bs=new Scanner(System.in);
		String username;
            int age;
		System.out.println("\t\t---------Online Voting System----------");
		System.out.println("Enter full name");
		username=bs.nextLine();
		System.out.println("Enter age");
		age=bs.nextInt();
		try
		{
			if(checkAge(age))//if checkage is true then  block of code executes
				{               
					System.out.println("Eligible to vote");
				}
		}
	catch(Exception e)
		{
		System.out.println(e);
		}
		finally{
			System.out.println("Thanks for your time");
		}
	}
	public static boolean checkAge(int age) throws ArithmeticException//throw an exception 
	{
		if(age>18)
			{
				return true;
			}
			else{
					throw new ArithmeticException("Error: user age is not enough to vote");
			}

	}
}
