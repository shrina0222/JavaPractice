package project;
import java.util.Scanner;

public class looppractice {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
// print numbers from 1 to 10.
		/*int i;
		for(i=0; i<=10; i++) {
			System.out.println(i);
		}

	}
}*/ 


//Write a program to calculate the sum of first 10 natural number.

		/*int sum =0;
		for(int i =0; i<=10; i++)
		{
			sum +=i;
		}
		System.out.println(sum);
	}
}*/

//Write a program that prompts
//the user to input a positive integer. It should then print the multiplication table of that number. 
		
		Scanner obj1= new Scanner(System.in);
		int num;
		System.out.print("Enter any positive integer: ");
		num = obj1.nextInt();
		System.out.println("Multiplication table of:" +num);
		
		for(int i=1; i<=10; i++)
		{
			System.out.println(num + "x" + i + "=" + (num*i));
		}
	}
}

//Write a program to find the factorial value of any number entered through the keyboard.
		
		/*Scanner console = new Scanner(System.in);
		int num;
		int fact =1;
		System.out.print("Enter a factorial number:");
		num = console.nextInt();
		for(int i=1; i<=num; i++) {
			fact *= i;
		}
		System.out.println("factorial of:" +fact);
	}
		
}
		
//Two numbers are entered through the keyboard. 
//Write a program to find the value of one number raised to the power of another.

		Scanner console1 = new Scanner(System.in);
		
		int base;
		int power;
		int result = 1;
		
		System.out.print("Enter the base number:"); 
		base = console1.nextInt();
		
		System.out.print("Enter the power number:"); 
		power = console1.nextInt();
		
		for(int i =1; i<=power; i++) {
			result *=base;
		}
		System.out.println("the final result of base to the power is: " +result);
	}
		
} 
		
//Write a program that prompts the user to input an integer and then outputs the number with the digits reversed. 
		//For example, if the input is 12345, the output should be 54321.
		
		Scanner console = new Scanner(System.in);
		int num;
		int reverse = 0;
		System.out.println("Enter the number");
		num = console.nextInt();
		int temp = num;
		int remainder = 0;
		while(temp>0)
		{
			remainder = temp % 10;
			reverse = reverse * 10 +remainder;
			temp /=10;
		}
		System.out.println("Reverse of" + num + "is:" +reverse);
	}
}
		
//Write a program that reads a set of integers, and then prints the sum of the even and odd integers.
		@SuppressWarnings("resource")
		Scanner console = new Scanner(System.in);
		int number;
		char choice;
		int evenSum = 0;
		int oddSum = 0;
		do
		{
			System.out.print("Enter the number");
			number = console.nextInt();
			
			if(number % 2 == 0)
			 {
				evenSum +=number;
			 }
			 else
			 {
				 oddSum +=number;
			 }
			 System.out.print("Do you want to continue y/n? ");
	         choice = console.next().charAt(0);
	            
	    }while(choice=='y' || choice == 'Y');
	        
	        System.out.println("Sum of even numbers: " + evenSum);
	        System.out.println("Sum of odd numbers: " + oddSum);
		}
	
} 

//Write a program that prompts the user to input a positive integer. 
		//It should then output a message indicating whether the number is a prime number.
		@SuppressWarnings("resource")
		Scanner console = new Scanner(System.in);
		int number;
		System.out.print("Enter a positive integer");
		number = console.nextInt();
		if(isprime(number)) {
			System.out.print(number + "is a prime number");
		} else {
			System.out.print(number + "is not a prime number");
		}
	}

	private static boolean isprime(int number) {
		if (number<=1) {
		
			return false;
		}
		for (int i = 2; i < Math.sqrt(number); i++) {  
	           if (number % i == 0) {  
	               return false;  
	           }  
	       }  
	       return true; 
		}
}*/

		
	



				
