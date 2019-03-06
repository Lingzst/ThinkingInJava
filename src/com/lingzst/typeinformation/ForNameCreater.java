package com.lingzst.typeinformation;

import java.util.ArrayList;
import java.util.List;

public class ForNameCreater extends PetCreator{
	static List<Class<? extends Pet>> types = new ArrayList<Class<? extends Pet>>();
	static String[]  petArray = {
			"fjel",
			"fejfll",
			"fefo"
	};
	@SuppressWarnings("unchecked")
	public static void addPetToList() {
		for(String str : petArray) {
			try {
				types.add((Class<? extends Pet>) Class.forName(str));
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		}
	}
	static {
		addPetToList();
	}
	@Override
	public List<Class<? extends Pet>> types() {
		// TODO Auto-generated method stub
		return types;
	}
	public static void main(String[] args) {
		ForNameCreater.addPetToList();
	}
}
