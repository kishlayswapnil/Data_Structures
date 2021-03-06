package com.bridgelabz.orderedlist;

import com.bridgelabz.utility.LinkListUtil;
import com.bridgelabz.utility.Node;

import java.io.*;
import java.util.Scanner;
//Ordered List class with all the necessary file operations.
public class OrderedList<T> {
	public static void main(String[] args) {
		LinkListUtil<String> objOrderedList = new LinkListUtil();
		try {
			String line1 = "";
			//Connects to the file so that further data extraction can be performed.
			FileInputStream extractFile = new FileInputStream("/home/bridgelabz/IdeaProjects/Data Structures/src/File.txt");
			// Extracts the data from the file.
			DataInputStream in = new DataInputStream(extractFile);
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			String line;
			//Read File Line By Line
			while ((line = br.readLine()) != null) {
				line1 = line1 + line;
				String words[] = line1.split(" ");
				for (int index = 0; index < words.length; index++)
					objOrderedList.addOrder(words[index]);
			}
			
			// Print the content on the console
			objOrderedList.display();
			Scanner scan = new Scanner(System.in);
			String item = scan.next();
			String value = objOrderedList.search(item);
			//Extracting the file again to write.
			FileWriter write = new FileWriter(extractFile);
			BufferedWriter out = new BufferedWriter(write);
			if ("true".equals(value)) {
				objOrderedList.remove(item);
				out.write(item.toString());
			} else {
				objOrderedList.add(item);
				out.write(item.toString());
			}
			//Print the content on the console
			objOrderedList.display();
			//Close the input stream
			in.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
