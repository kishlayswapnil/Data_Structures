package com.bridgelabz.unorderedlist;

import com.bridgelabz.utility.LinkListUtil;

import java.io.*;
import java.util.Scanner;

//Unordered List class with all the necessary file operations.
public class UnOrderedList<T> {
	public static void main(String[] args) throws Exception
	{
		LinkListUtil objUnOrderedList=new LinkListUtil();
		try{
			String line1="";
			//Connects to the file so that further data extraction can be performed.
			FileInputStream extractFile = new FileInputStream("/home/bridgelabz/IdeaProjects/Data Structures/src/com/bridgelabz/unorderedlist/File.txt");
			// Extracts the data from the file.
			DataInputStream in = new DataInputStream(extractFile);
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			String line;
			//Read File Line By Line
			while ((line = br.readLine()) != null)   {
				line1=line1+line;
				String words[] = line1.split(" ");
				for (int index = 0; index < words.length; index++)
					objUnOrderedList.add(words[index]);
			}
			
			// Print the content on the console
			objUnOrderedList.display();
			Scanner scan=new Scanner(System.in);
			String item=scan.next();
			String value=objUnOrderedList.search(item);
			FileWriter write = new FileWriter(extractFile);
			BufferedWriter out = new BufferedWriter(write);
			if ("true".equals(value))
			{
				objUnOrderedList.remove(item);
				out.write(item.toString());
			}else {
				objUnOrderedList.add(item);
				out.write(item.toString());
			}
			// Print the content on the console
			objUnOrderedList.display();
			//Close the input stream
			in.close();
		}catch (Exception e){
			e.printStackTrace();
		}
	}
}