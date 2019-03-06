package com.lingzst.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class TextFile extends ArrayList<String> {
	
	public static  String read(String filename)  {
		StringBuilder sb = new StringBuilder();
		try {
			BufferedReader in = new BufferedReader(new FileReader(filename));
			String s = in.readLine();
			while((s = in.readLine()) != null) {
				sb.append(s);
				sb.append("\n");
			}
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return sb.toString();
	}
	
	public static void write(String filename, String text) {
		try {
			PrintWriter out = new PrintWriter(new File(filename));
			out.print(text);
			out.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public TextFile(String filename, String splitter) {
		super(Arrays.asList(read(filename).split(splitter)));
		if(get(0).equals("")) remove(0);
	}
	//通常的按照行来读取
	public TextFile(String filename) {
		this(filename, "\n");
	}
	
	public void write(String filename) {
		
		try {
			PrintWriter out = new PrintWriter(new File(filename));  
			try {
			for(String item : this)
				out.println(item);
			} finally {
				out.close();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		String file = read("C:\\\\Users\\\\Jaxier\\\\git\\\\ThinkingInJava\\\\src\\\\Test1.java");
		write("woefwefowefowhefoih.txt", file);
		TextFile text = new TextFile("C:\\Users\\Jaxier\\git\\ThinkingInJava\\woefwefowefowhefoih.txt");
		text.write("what.txt");
		TreeSet<String> words = new TreeSet<String>(new TextFile("C:\\Users\\Jaxier\\git\\ThinkingInJava\\what.txt", "\\W+"));
		System.out.println(words);
		System.out.println(words.headSet("a"));
	}
}
