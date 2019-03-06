package com.lingzst.arrays;

import java.io.*;
import java.util.*;

public class Turtle {
	private String name;
	private Formatter f;
	public Turtle(String name, Formatter f) {
		this.name = name;
		this.f = f;
	}
	public void move(int x, int y) {
		f.format("%s The Turtle is at (%d, %d)\n", name, x, y);
	}
	public static void main(String[] args) {
		PrintStream outAlias = System.out;
		Turtle tommy = new Turtle("Tommy", new Formatter(System.out));
		Turtle terry = new Turtle("terry", new Formatter(outAlias));
		tommy.move(1, 2);
		terry.move(3, 1);
	}
}
