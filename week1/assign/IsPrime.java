package week1.assign;
/*
 * Goal: To understand the problem solving, looping and conditional statement

a) Create a class by name: IsPrime
b) Create a main method using shortcut
c) Write a logic to find if the given number is prime or not
d) Print if it is prime or not

Hint: Iterate through all numbers from 2 to n-1 (input) and 
for every number check if it divides n (input). 
If we find any number that divides, print prime.
If nothing divides, then print non-prime

Time to given: 15 - 20 minutes.
 */


/* below code is working fine.... but we are getting warning as dead code in for loop line
public class IsPrime {
	public static void main(String[] args) {
		int n = 5;
		if (n == 0 || n == 1 || n == 2) {
			System.out.println("Number " + n + " is not a prime number");

		}

		else {
			for (int i = 3; i <= 7; i++) {
				if (n % i == 0) {
					System.out.println("Number " + n + " is not a prime number");
					break;

				} else {
					System.out.println("Number " + n + " is a prime number");
					break;

				}
			}

		}
	}
}
*/


public class IsPrime{    
	 public static void main(String args[]){    
	  int i,m=0,flag=0;      
	  int n=3;//it is the number to be checked    
	  m=n/2;      
	  if(n==0||n==1){  
	   System.out.println(n+" is not prime number");      
	  }else{  
	   for(i=2;i<=m;i++){      
	    if(n%i==0){      
	     System.out.println(n+" is not prime number");      
	     flag=1;      
	     break;      
	    }      
	   }      
	   if(flag==0)  { System.out.println(n+" is prime number"); }  
	  }//end of else  
	}    
	}   