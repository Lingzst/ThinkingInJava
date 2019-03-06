package com.lingzst.io;

import java.io.PrintWriter;

public class ChangeSystemOut {
	public static void main(String[] args) {
		PrintWriter out = new PrintWriter(System.out,true);
		out.println("fheo");
	}
}
