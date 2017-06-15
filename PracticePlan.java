package yourCode;
import java.util.*;
import java.io.*;

public class PracticePlan {

	public static void main(String[] args) throws FileNotFoundException {
		
		//create scanners for console and text files
		Scanner console = new Scanner(System.in);
		Scanner majorScalesIn = new Scanner(new FileReader("scalesmajor.txt"));
		Scanner minorScalesIn = new Scanner(new FileReader("scalesminor.txt"));
		Scanner concertosIn = new Scanner(new FileReader("concertos.txt"));
		Scanner etudesIn = new Scanner(new FileReader("etudes.txt"));
		Scanner sonatasIn = new Scanner(new FileReader("sonatas.txt"));
		PrintStream out = new PrintStream(new File("Plan"));
		
		//user interface
		System.out.println("Welcome to practice plan! Please enter the duration in minutes.");
		int time = console.nextInt();
		System.out.println("Please enter a difficulty level: I, II, III, IV");
		String rank = console.next();
		if(time > 0 && time < 15) {
			MajorScaleBook majorScaleBook = new MajorScaleBook(majorScalesIn);
			MinorScaleBook minorScaleBook = new MinorScaleBook(minorScalesIn);
			EtudeBook etudeBook = new EtudeBook(etudesIn);
			System.out.println("Enter the name of the major scale or \"r\" for a random major scale.");
			String scale1 = console.next();
			if(scale1.equalsIgnoreCase("r")) {
				int randomScaleIndex = (int)(Math.random() * majorScaleBook.size());
				out.println(majorScaleBook.get(randomScaleIndex).toString());
			
			/*
			} else if (scale1.equalsIgnoreCase("C") || scale1.equalsIgnoreCase("g") || scale1.equalsIgnoreCase("d") || scale1.equalsIgnoreCase("a") || scale1.equalsIgnoreCase("e") || scale1.equalsIgnoreCase("b") || scale1.equalsIgnoreCase("f#") || scale1.equalsIgnoreCase("c#") || scale1.equalsIgnoreCase("ab") || scale1.equalsIgnoreCase("eb") || scale1.equalsIgnoreCase("bb") || scale1.equalsIgnoreCase("f")) {
				
				while(true) {
					int randomScaleIndex = (int)(Math.random() * majorScaleBook.size());
					if(majorScaleBook.get(randomScaleIndex).getName().equalsIgnoreCase(scale1)) {
						out.println(majorScaleBook.get(randomScaleIndex).toString());
						break;
					}
				}
				parallel = scale1;
				relative = majorScaleBook.get(majorScaleBook.indexOf(scale1)).getRelative();
			} else {
			} 
			*/
			} else {
					
			}
			System.out.println("Enter parallel, relative, or r for the corresponding minor scale.");
			String scale2 = console.next();
			if(scale2.equalsIgnoreCase("r")) {
				out.println(minorScaleBook.get((int)(Math.random() * (minorScaleBook.size()))));
			/*
			} else if(scale2.equalsIgnoreCase("parallel")) {
				out.println(minorScaleBook.get(minorScaleBook.indexOf(parallel)));
			} else if(scale2.equalsIgnoreCase("relative")) {
				out.println(minorScaleBook.get(minorScaleBook.indexOf(parallel)));
			} else {

			}
			*/
			} else {
				
			}
			
			//picks random etude of appropriate length
			while(true) {
				int rand = (int)(Math.random()*etudeBook.size());
				if(etudeBook.get(rand).getRank().equalsIgnoreCase(rank)) {
					out.println(etudeBook.get(rand));
					break;
				}
			}
		} else if(time > 15 && time < 30) {
			MajorScaleBook majorScaleBook = new MajorScaleBook(majorScalesIn);
			MinorScaleBook minorScaleBook = new MinorScaleBook(minorScalesIn);
			EtudeBook etudeBook = new EtudeBook(etudesIn);
			System.out.println("Enter the name of the major scale or \"r\" for a random major scale.");
			String scale1 = console.next();
			if(scale1.equalsIgnoreCase("r")) {
				int randomScaleIndex = (int)(Math.random() * majorScaleBook.size());
				out.println(majorScaleBook.get(randomScaleIndex).toString());
			} else {
				
			}
			System.out.println("Enter parallel, relative, or r for the corresponding minor scale.");
			String scale2 = console.next();
			if(scale2.equalsIgnoreCase("r")) {
				out.println(minorScaleBook.get((int)(Math.random() * (minorScaleBook.size()))));
			} else {
				
			}
			//picks random etude of appropriate rank
			while(true) {
				int rand = (int)(Math.random()*etudeBook.size());
				if(etudeBook.get(rand).getRank().equalsIgnoreCase(rank)) {
					out.println(etudeBook.get(rand));
					break;
				}
			}
			
			//picks random etude of appropriate rank
			while(true) {
				int rand = (int)(Math.random()*etudeBook.size());
				if(etudeBook.get(rand).getRank().equalsIgnoreCase(rank)) {
					out.println(etudeBook.get(rand));
					break;
				}
			}
			
		} else if(time > 30 && time < 45) {
			MajorScaleBook majorScaleBook = new MajorScaleBook(majorScalesIn);
			MinorScaleBook minorScaleBook = new MinorScaleBook(minorScalesIn);
			EtudeBook etudeBook = new EtudeBook(etudesIn);
			ConcertoBook concertoBook = new ConcertoBook(concertosIn);
			
			System.out.println("Enter the name of the major scale or \"r\" for a random major scale.");
			String scale1 = console.next();
			if(scale1.equalsIgnoreCase("r")) {
				int randomScaleIndex = (int)(Math.random() * majorScaleBook.size());
				out.println(majorScaleBook.get(randomScaleIndex).toString());
			} else {
				
			}
			System.out.println("Enter parallel, relative, or r for the corresponding minor scale.");
			String scale2 = console.next();
			if(scale2.equalsIgnoreCase("r")) {
				out.println(minorScaleBook.get((int)(Math.random() * (minorScaleBook.size()))));
			} else {
				
			}
			
			//picks random etude of appropriate rank
			while(true) {
				int rand = (int)(Math.random()*etudeBook.size());
				if(etudeBook.get(rand).getRank().equalsIgnoreCase(rank)) {
					out.println(etudeBook.get(rand));
					break;
				}
			}
			
			//picks random concerto of appropriate rank
			while(true) {
				int rand = (int)(Math.random()*concertoBook.size());
				if(concertoBook.get(rand).getRank().equalsIgnoreCase(rank)) {
					out.println(concertoBook.get(rand));
					break;
				}
			}
			
		} else if(time > 45 && time < 60) {
			MajorScaleBook majorScaleBook = new MajorScaleBook(majorScalesIn);
			MinorScaleBook minorScaleBook = new MinorScaleBook(minorScalesIn);
			EtudeBook etudeBook = new EtudeBook(etudesIn);
			ConcertoBook concertoBook = new ConcertoBook(concertosIn);
			
			System.out.println("Enter the name of the major scale or \"r\" for a random major scale.");
			String scale1 = console.next();
			if(scale1.equalsIgnoreCase("r")) {
				int randomScaleIndex = (int)(Math.random() * majorScaleBook.size());
				out.println(majorScaleBook.get(randomScaleIndex).toString());
			} else {
				
			}
			System.out.println("Enter parallel, relative, or r for the corresponding minor scale.");
			String scale2 = console.next();
			if(scale2.equalsIgnoreCase("r")) {
				out.println(minorScaleBook.get((int)(Math.random() * (minorScaleBook.size()))));
			} else {
				
			}
			
			//picks random etude of appropriate rank
			while(true) {
				int rand = (int)(Math.random()*etudeBook.size());
				if(etudeBook.get(rand).getRank().equalsIgnoreCase(rank)) {
					out.println(etudeBook.get(rand));
					break;
				}
			}
			
			//picks random etude of appropriate rank
			while(true) {
				int rand = (int)(Math.random()*etudeBook.size());
				if(etudeBook.get(rand).getRank().equalsIgnoreCase(rank)) {
					out.println(etudeBook.get(rand));
					break;
				}
			}
			
			//picks random concerto of appropriate rank
			while(true) {
				int rand = (int)(Math.random()*concertoBook.size());
				if(concertoBook.get(rand).getRank().equalsIgnoreCase(rank)) {
					out.println(concertoBook.get(rand));
					break;
				}
			}
			
		} else if(time > 60) {
			MajorScaleBook majorScaleBook = new MajorScaleBook(majorScalesIn);
			MinorScaleBook minorScaleBook = new MinorScaleBook(minorScalesIn);
			EtudeBook etudeBook = new EtudeBook(etudesIn);
			ConcertoBook concertoBook = new ConcertoBook(concertosIn);
			SonataBook sonataBook = new SonataBook(sonatasIn);
			
			System.out.println("Enter the name of the major scale or \"r\" for a random major scale.");
			String scale1 = console.next();
			if(scale1.equalsIgnoreCase("r")) {
				int randomScaleIndex = (int)(Math.random() * majorScaleBook.size());
				out.println(majorScaleBook.get(randomScaleIndex).toString());
			} else {
				
			}
			System.out.println("Enter parallel, relative, or r for the corresponding minor scale.");
			String scale2 = console.next();
			if(scale2.equalsIgnoreCase("r")) {
				out.println(minorScaleBook.get((int)(Math.random() * (minorScaleBook.size()))));
			} else {
				
			}
			
			//picks random etude of appropriate rank
			while(true) {
				int rand = (int)(Math.random()*etudeBook.size());
				if(etudeBook.get(rand).getRank().equalsIgnoreCase(rank)) {
					out.println(etudeBook.get(rand));
					break;
				}
			}
			
			//picks random etude of appropriate rank
			while(true) {
				int rand = (int)(Math.random()*etudeBook.size());
				if(etudeBook.get(rand).getRank().equalsIgnoreCase(rank)) {
					out.println(etudeBook.get(rand));
					break;
				}
			}
			
			//picks random sonata of appropriate rank
			while(true) {
				int rand = (int)(Math.random()*sonataBook.size());
				if(sonataBook.get(rand).getRank().equalsIgnoreCase(rank)) {
					out.println(sonataBook.get(rand));
					break;
				}
			}
			
			//picks random concerto of appropriate rank
			while(true) {
				int rand = (int)(Math.random()*concertoBook.size());
				if(concertoBook.get(rand).getRank().equalsIgnoreCase(rank)) {
					out.println(concertoBook.get(rand));
					break;
				}
			}
			
			
		} else {
		}
		
		
		//close scanners
		concertosIn.close();
		etudesIn.close();
		sonatasIn.close();
		console.close();
	}
}
