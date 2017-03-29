package uil03252017;

import static java.lang.System.out;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * 
 * 
 * COMMENT OUT THE PACKAGE YOU SHITS
 * 
 * 
 * 
 */

public class Hyo {
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(new File("hyo.dat"));
		Dataset[] sets = new Dataset[input.nextInt()]; //Creates an array of datasets with the length specified
		
		while(input.hasNext()) {
			
		}
	}
}

class Friend {
	String name;
	ArrayList<String> peers;
	Friend(String name, ArrayList<String> peers) {
		this.name = name;
		this.peers = peers;
	}
}

class Dataset {
	ArrayList<Friend> people;
	Dataset(ArrayList<Friend> people) {
		this.people = people;
	}
	void lookupConnection(String from, String to) {
		//
	}
}