package uil03252017;

import static java.lang.System.out;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*
 * 
 * 
 * COMMENT OUT THE PACKAGE YOU SHITS
 * 
 * 
 * 
 */

public class Suresh {
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(new File("suresh.dat"));
		
		//Num of sentences
		//Num of words in each sentence
		
		while(input.hasNext()) {
			String paragraph = input.nextLine();
			String[] sentences = paragraph.split("[.|?]");
			out.print(sentences.length+" ");
			//testArray(sentences);
			for(int i = 0; i < sentences.length; i++) {
				String[] words = sentences[i].split(" ");
				//testArray(words);			
				
				int len = words.length;
				
				if(isWhitespace(words[0])) {
					len--;
				}
				
				//testArray(words);
				
				out.print(len+" ");
				
				String longestWord = "";
				for(int j = 0; j < words.length; j++) {
					if(words[j].length() >= longestWord.length()) {
						longestWord = words[j];
					}
				}
				out.print(longestWord+" ");
				
			}
			out.println();
		}
	}
	
	public static void testArray(String[] arr) {
		int i = 0;
		for(String str: arr) {
			out.println("["+i+"] "+str);
			i++;
		}
	}
	public static boolean isWhitespace(String str) {
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) != ' ') {
				return false;
			}
		}
		return true;
	}

}

