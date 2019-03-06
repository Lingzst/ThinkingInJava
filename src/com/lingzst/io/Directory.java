package com.lingzst.io;

import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Pattern;

public final class Directory {
	public static File[] local(File dir, final String regex) {
		return dir.listFiles(new FilenameFilter() {
			private Pattern pattern = Pattern.compile(regex);
			public boolean accept(File dir, String name) {
				return pattern.matcher(name).matches();
			}
		});
	}
	public static File[] local(String path, final String name) {
		return local(new File(path), name);
	}
	
	public static class TreeInfo implements Iterable<File>{
		public  ArrayList<File> files = new ArrayList<File>();
		public  ArrayList<File> dirs = new ArrayList<>();
		@Override
		public Iterator<File> iterator() {
			return files.iterator();
		}
		void addAll(TreeInfo other) {
			files.addAll(other.files);
			dirs.addAll(other.dirs);
		}
		public String toString() {
			return "dirs" + "files"; 
		}
	}
	
	public static TreeInfo walk(String start) {
		return recurseDirs(new File(start), ".*");
	}
	
	public static TreeInfo recurseDirs(File startDirs, String regex) {
		TreeInfo result = new TreeInfo();
		for(File item : startDirs.listFiles()) {
			if(item.isDirectory()) {
				result.dirs.add(item);
				result.addAll(recurseDirs(item, regex));
			}else
				if(item.getName().matches(regex))
					result.files.add(item);
		}
		return result;
	}
}
