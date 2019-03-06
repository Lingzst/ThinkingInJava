package com.lingzst.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;

public class BasicFileOutput {
	static String file = "BasicFileOutput.out";
	public static void main(String[] args) throws IOException{
		BufferedReader in = new BufferedReader(
				new StringReader(
						BufferedInputFile.read("src/com/lingzst/io/BufferedInputFile.java")));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(file)));
		PrintWriter outshortcut = new PrintWriter(file);
		int lineCount = 1;
		String s;
		while((s = in.readLine()) != null)
			out.println(lineCount++ + ": " + s);
		out.close();
		System.out.println(BufferedInputFile.read(file));
	}
	
}
