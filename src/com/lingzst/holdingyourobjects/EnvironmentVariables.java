package com.lingzst.holdingyourobjects;
import java.util.*;

public class EnvironmentVariables {
	public static void main(String[] args) {
		for(@SuppressWarnings("rawtypes") Map.Entry entry : System.getenv().entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
	}
}
