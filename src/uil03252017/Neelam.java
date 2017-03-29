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

public class Neelam {
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(new File("neelam.dat"));
		
		while(input.hasNext()) {
			int n = input.nextInt();
			out.println(n);
			soroban(n);
			out.println();
		}
	}
	
	public static void soroban(int n) {
		char[][] beads = new char[8][(n+"").length()];
		
		//Preset beads
		for(int r = 0; r < beads.length; r++) {
			for(int c = 0; c < beads[r].length; c++) {
				if(r == 2) {
					beads[r][c] = '=';
				}
				else {
					beads[r][c] = 'o';
				}
			}
		}
		
		//Split digits
		int[] digits = new int[(n+"").length()];
		for(int i = digits.length-1; i >= 0; i--) {
			digits[i] = n % 10;
			n /= 10;
		}
		
		//Place | correctly
		for(int i = 0; i < digits.length; i++) {
			if(digits[i] >= 5) {
				beads[0][i] = '|';
			}
			else {
				beads[1][i] = '|';
			}
			
			if(digits[i] == 0 || digits[i] == 5) {
				beads[3][i] = '|';
			}
			else if(digits[i] == 1 || digits[i] == 6) {
				beads[4][i] = '|';
			}
			else if(digits[i] == 2 || digits[i] == 7) {
				beads[5][i] = '|';
			}
			else if(digits[i] == 3 || digits[i] == 8) {
				beads[6][i] = '|';
			}
			else if(digits[i] == 9 || digits[i] == 4) {
				beads[7][i] = '|';
			}
			
		}
		
		//Print matrix
		for(int r = 0; r < beads.length; r++) {
			for(int c = 0; c < beads[r].length; c++) {
				out.print(beads[r][c]);
			}
			out.println();
		}
		
	}
}

