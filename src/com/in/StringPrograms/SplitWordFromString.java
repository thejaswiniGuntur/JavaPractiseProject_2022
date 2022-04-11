package com.in.StringPrograms;

public class SplitWordFromString {

	public static void splittingWords(String str){
		
		String[] words=str.split(" ");
		for(String word:words){
			System.out.println(word);
			
		}
		
	}
public static void splittingWordsWithRegex(String str){
		
		String[] words=str.split("\\s");
		for(String word:words){
			System.out.println(word);
			
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="theju test data";
		splittingWords(str);
		splittingWordsWithRegex(str);

	}

}
