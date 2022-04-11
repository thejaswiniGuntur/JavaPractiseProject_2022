package com.in.StringPrograms;

import java.io.BufferedReader;

public class ReversingAString {

	public static void reverseString(String str){
		
		StringBuffer sbf= new StringBuffer(str);
		sbf.reverse();
		System.out.println(sbf);
		
	}
	public static void normalApproach_ReversingString(String str){
		char[] chars=str.toCharArray();
		str="";
		for(int i=0; i<chars.length;i++){
			
			str=str+chars[chars.length-1-i];
			
		}
		System.out.println(str);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="practiseTest";
		reverseString(str);
		normalApproach_ReversingString(str);

	}

}
