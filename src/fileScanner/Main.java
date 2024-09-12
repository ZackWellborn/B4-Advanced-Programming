	import java.util.Scanner;
	import java.io.*;
	
	public class Main {
		public static void main(String[] args) {
			try {
				File myFile = new File("input.txt");
				System.out.println(myFile.exists());
				Scanner sc = new Scanner(myFile);
			
				while (sc.hasNextLine()) {
					//breaks here vvvvv
					int i = sc.nextInt();
	            	System.out.println(i);
	        	}
				sc.close();
			} 
			//broken?
			catch (Exception e) {
				System.out.println("lol");
			}
			
				
		}
	}
	
	
	
	//https://www.geeksforgeeks.org/java-io-filereader-class/
	//https://stackoverflow.com/questions/16265693/how-to-use-bufferedreader-in-java
	//https://www.w3schools.com/java/java_files_read.asp
	//https://www.w3schools.com/java/java_files.asp
	//https://stackoverflow.com/questions/822150/modify-a-txt-file-in-java
	//https://stackoverflow.com/questions/13185727/reading-a-txt-file-using-scanner-class-in-java
//^this
