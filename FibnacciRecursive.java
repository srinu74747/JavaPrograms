import java.util.Scanner;

public class FibnacciRecursive {

	static int n1=0,n2=1,value=0;
	
	public static void main(String[] args) {
		
		int noOfFib=0;
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no.of fibonaccis:");
		noOfFib = sc.nextInt();
		System.out.println("Enter no.of fibonaccis:"+n1+","+n2);
		fib(noOfFib-2); 
		
		//Fibonacci series with out recursion
		
//		if( noOfFib >1 ) {
//			
//			if( noOfFib == 1 )
//				System.out.println("Enter no.of fibonaccis:"+n1);
//			else if( noOfFib == 2 )
//				System.out.println("Enter no.of fibonaccis:\n"+n1+","+n2);
//			else {
//				
//				System.out.println("Enter no.of fibonaccis:"+n1+","+n2);
//				
//				for(int i=0;i<noOfFib-2;i++) {
//					
//					value = n1+n2;
//					n1=n2;
//					n2=value;
//					System.out.println(value);
//					
//				}
//			}
//				
//		}
		
		
	}
	
	// Fibonacci sequence Using Recursion
	
	public static void fib(int count) {
		
		if(count>0) {
			
			value = n1+n2;
			n1=n2;
			n2=value;
			System.out.println(value);
			fib(count-1);
		}
		
	}
	
	//Find nth Fibonacci Number
	
	static int fib2(int n) {
		if (n <= 1)
			return n;
		return fib2(n - 1) + fib2(n - 2);
	} 

}
