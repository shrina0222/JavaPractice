package project;

import java.util.Scanner;

public class BankAccount
{
	private String accno;
	private static String name;
	private String email;
	private long balance;
	private long phonenum;

	Scanner bank=new Scanner(System.in);
	
	//method to open an account
	public void openAccount()
	{ 
		System.out.print("Enter Account No: ");
		accno=bank.next();
		System.out.print("Enter Name: ");
		name=bank.next();
		System.out.print("Enter Balance: ");
		balance=bank.nextLong();
		System.out.print("Enter Email: ");
		email=bank.next();
		System.out.print("Enter Phone No: ");
		phonenum=bank.nextLong();
	}

	//method to display account details
	public void showAccount()
	{ 
		System.out.println("Account number:" +accno+"\n Customer Name:" +name+"\nBalance:" +balance+"\nEmail:" +email+"\nPhone Number:" +phonenum);
	}

	//method to deposit money
	 public void deposit()
	{
		long amt;
		System.out.println("Enter Amount you Want to Deposit : ");
		amt=bank.nextLong();
		balance=balance+amt;
		System.out.println("Successfully deposited " +amt+ "into " +name);
	}

	//method to withdraw money
	void withdrawal()
	{
		long amt;
		System.out.println("Enter Amount you Want to withdraw : ");
		amt=bank.nextLong();
		if(balance>=amt)
		{ 
			balance=balance-amt;
			System.out.println("Successfully withdrawn " +amt+ "from" +name);
		}
		else
		{
			System.out.println("Insufficiant Balance ..Transaction Failed for.." +name );
		}
	}

	//method to search by an account number
	boolean search(String acn)
	{ 
		if(accno.equals(acn))
		{ 
			showAccount();
			return(true);
		}
		return(false);
	}
  
	public static void main(String arg[])
	{
		//@SuppressWarnings("resource")
		Scanner bank=new Scanner(System.in);
		
		//create initial accounts
		System.out.print("How Many Customer U Want to Input : ");
		int n=bank.nextInt();
		BankAccount  C[]=new BankAccount[n];
		for(int i=0;i<C.length;i++)
		{   
			C[i]=new BankAccount();
			C[i].openAccount();
		}
		
		//run loop until menu 5 is not pressed
		int ch;
		do
		{
			System.out.println("Main Menu\n 1.Display All\n 2.Search By Account\n 3.Deposit\n 4.Withdrawal\n 5.Exit");
			System.out.println("Ur Choice :");
			ch=bank.nextInt();
			switch(ch)
			{ 
				case 1:
					for(int i=0;i<C.length;i++)
					{
						C[i].showAccount();
					}
					break;

				case 2:
					System.out.print("Enter Account No You Want to Search...: ");
					String acn=bank.next();
					boolean found=false;
					for(int i=0;i<C.length;i++)
					{  
						found=C[i].search(acn);
						if(found)
						{
							break;
						}
					}
					if(!found)
					{
						System.out.println("Search Failed..Account Not Exist..");
					}
					break;

				case 3:
					System.out.print("Enter Account No : ");
					acn=bank.next();
					found=false;
					for(int i=0;i<C.length;i++)
					{  
						found=C[i].search(acn);
						if(found)
						{
							C[i].deposit();
							break;
						}
					}
					if(!found)
					{
						System.out.println("Search Failed..Account Not Exist..");
					}
					break;

				case 4:
					System.out.print("Enter Account No : ");
					acn=bank.next();
					found=false;
					for(int i=0;i<C.length;i++)
					{  
						found=C[i].search(acn);
						if(found)
						{
							C[i].withdrawal();
							break;
						}
					}
					if(!found)
					{
						System.out.println("Search Failed..Account Not Exist..");
					}
					break;

				case 5:
					System.out.println("Good Bye.." +name);
					break;
			}
		}
		while(ch!=5);
	}
}


