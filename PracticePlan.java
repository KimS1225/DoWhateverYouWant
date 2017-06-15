package yourCode;
import java.util.*;
import java.io.*;

public class PracticePlan throws FileNotFoundException {
	
	public static void main(String[] args) throws IllegalArgumentException {
		
		//create scanners for console and test files
		Scanner console = new Scanner(System.in);
		Scanner majorScalesIn = new Scanner(new FileReader("scalesmajor.txt"));
		Scanner minorScalesIn = new Scanner(new FileReader("scalesminor.txt"));
		Scanner concertosIn = new Scanner(new FileReader("concertos.txt"));
		Scanner etudesIn = new Scanner(new FileReader("etudes.txt"));
		Scanner sonatasIn = new Scanner(new FileReader("sonatas.txt"));
		
		//user interface
		System.out.println("Welcome to practice plan! Please enter the duration in minutes.");
		int time = console.nextInt();
		if(time > 0 && time < 15) {
			MajorScaleBook majorScaleBook = new MajorScaleBook(majorScalesIn);
			MinorScaleBook minorScaleBook = new MinorScaleBook(minorScalesIn);
			EtudeBook etudeBook = new EtudeBook(etudesIn);
			System.out.println("Enter the name of the major scale or \"r\" for a random major scale.");
			String scale1 = console.next();
			String parallel, relative;
			if(scale1.equalsIgnoreCase("r")) {
				int randomScaleIndex = (int)(Math.random() * majorScaleBook.size());
				System.out.println(majorScaleBook.get(randomScaleIndex).toString());
				parallel = majorScaleBook.get(randomScaleIndex).getName();
				relative = majorScaleBook.get(randomScaleIndex).getRelative();
			} else if (scale1.equalsIgnoreCase("C") || scale1.equalsIgnoreCase("g") || scale1.equalsIgnoreCase("d") || scale1.equalsIgnoreCase("a") || scale1.equalsIgnoreCase("e") || scale1.equalsIgnoreCase("b") || scale1.equalsIgnoreCase("f#") || scale1.equalsIgnoreCase("c#") || scale1.equalsIgnoreCase("ab") || scale1.equalsIgnoreCase("eb") || scale1.equalsIgnoreCase("bb") || scale1.equalsIgnoreCase("f")) {
				System.out.println(majorScaleBook.get(majorScaleBook.indexOf(scale1)).toString());
				parallel = majorScaleBook.get(majorScaleBook.indexOf(scale1)).getName();
				relative = majorScaleBook.get(majorScaleBook.indexOf(scale1)).getRelative();
			} else {
				throw new IllegalArgumentException ("Please enter a valid time.");
			}
			System.out.println("Enter parallel, relative, or r for the corresponding minor scale.");
			String scale2 = console.next();
			if(scale2.equalsIgnoreCase("r")) {
				System.out.println(minorScaleBook.get((int)(Math.random() * (minorScaleBook.size()))));
			} else if(scale2.equalsIgnoreCase("parallel")) {
				System.out.println(minorScaleBook.get(minorScale.indexOf()))
			} 
		} else if(time > 15 && time < 30) {
			
		} else if(time > 30 && time < 45) {
			MajorScaleBook majorScaleBook = new MajorScaleBook(majorScalesIn);
			MinorScaleBook minorScaleBook = new MinorScaleBook(minorScalesIn);
			EtudeBook etudeBook = new EtudeBook(etudesIn);
			ConcertoBook concertoBook = new ConcertoBook(concertosIn);
		} else if(time > 45 && time < 60) {
			MajorScaleBook majorScaleBook = new MajorScaleBook(majorScalesIn);
			MinorScaleBook minorScaleBook = new MinorScaleBook(minorScalesIn);
			EtudeBook etudeBook = new EtudeBook(etudesIn);
			ConcertoBook concertoBook = new ConcertoBook(concertosIn);
		} else if(time > 60) {
			MajorScaleBook majorScaleBook = new MajorScaleBook(majorScalesIn);
			MinorScaleBook minorScaleBook = new MinorScaleBook(minorScalesIn);
			EtudeBook etudeBook = new EtudeBook(etudesIn);
			ConcertoBook concertoBook = new ConcertoBook(concertosIn);
			SonataBook sonataBook = new SonataBook(sonatasIn);
		}
		
		
		//close scanners
		concertosIn.close();
		etudesIn.close();
		sonatasIn.close();
	}
	
	
	

		
	
}
