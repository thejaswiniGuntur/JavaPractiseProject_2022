package com.in.StringPrograms;

public class FibinociSeries {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10;
		int fib3=0;
		int fib=0;
		int fib2=1;
		for(int i=2; i<a;i++){
			if(fib==0&&fib2==1){
				 System.out.print(fib);
				 System.out.print(fib2);
			 }
			
			 fib3= fib+fib2;
			 fib=fib2;
			 fib2=fib3;
			
			 
			 System.out.print(fib3);	
		}
System.out.println();
	}

}
