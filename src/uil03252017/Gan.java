package uil03252017;

import static java.lang.System.out;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Gan {
	
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(new File("gan.dat"));
		out.println(getDashes(38));
		while(input.hasNext()) {
			printRow(input.nextInt());
		}
		out.println(getDashes(38));
	}
	public static void printRow(int r) {
		if(getR(r).length() == 1) {
			out.print(getSpaces(1));
		}
		else if(getR(r).length() == 2) {
			//do nothing
		}
		out.print(r);
		out.print(getSpaces(9-getCirc(r).length()));
		out.print(getCirc(r));
		out.print(getSpaces(9-getArea(r).length()));
		out.print(getArea(r));
		out.print(getSpaces(9-getSurf(r).length()));
		out.print(getSurf(r));
		out.print(getSpaces(9-getVol(r).length()));
		out.print(getVol(r));
		out.println();
	}
	public static String getR(int r) {
		return r+"";
	}
	public static String getCirc(int r) {
		return ((double)(Math.round((2*Math.PI*r)*10.0))/10.0)+"";
	}
	public static String getArea(int r) {
		return ((double)(Math.round((Math.PI*Math.pow(r, 2))*10.0)))/10.0+"";
	}
	public static String getSurf(int r) {
		return ((double)(Math.round(4.0*Math.PI*Math.pow(r, 2)*10.0)))/10.0+"";
	}
	public static String getVol(int r) {
		return ((double)(Math.round((4.0/3.0)*Math.PI*Math.pow(r, 3)*10.0)))/10.0+"";
	}
	public static String getSpaces(int n) {
		String s = "";
		for(int i = 0; i < n; i++) 
			s += " ";
		return s;
	}
	public static String getDashes(int n) {
		String s = "";
		for(int i = 0; i < n; i++) 
			s += "-";
		return s;
	}
}
