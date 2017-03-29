package uil03252017;

import static java.lang.System.out;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Sample {
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(new File("kate.dat"));
		while(input.hasNext()) {
			out.println(input.next());
		}
	}
}
