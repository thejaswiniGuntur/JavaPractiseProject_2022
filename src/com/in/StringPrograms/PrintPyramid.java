package com.in.StringPrograms;

public class PrintPyramid {
	
	
	public static void printPhyramid_RightSide_increment(int n){
		
		for(int i=0;i<n;i++){
			
			for(int j=0; j<=i;j++){
				
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		
	}
	public static void printPhyramid_RightSide_decrement(int n){
		
		for(int i=0;i<n;i++){
			
			for(int j=0; j<n-i;j++){
				
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		
	}
	public static void fullPyramid(int n){
		int k=0;
		  for(int i=1; i<=n;i++,k=0){
			  for(int spe=1;spe<=n-i;spe++){
				  System.out.print(" ");
			  }
			  while(k!=2*i-1){
				  System.out.print("*");
				  k++;
			  }
			  System.out.println();
		  }
	}
	public static void main(String[] args){
		int n=8;
		//printPhyramid_RightSide_increment(n);
		//printPhyramid_RightSide_decrement(n);
		fullPyramid(5);
		
	}

}
