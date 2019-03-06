package com.lingzst.io;

import java.io.File;

public class DirectoryDemo {
	public static void main(String[] args) {
		PPrint.pprint(Directory.walk(".").dirs);
		for(File file : Directory.local(".", "T.*"))
			System.out.println(file);
		System.out.println("--------------------");
	}
}
