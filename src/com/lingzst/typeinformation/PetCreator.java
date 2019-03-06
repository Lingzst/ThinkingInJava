package com.lingzst.typeinformation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public abstract class PetCreator {
	private Random rand = new Random(47);
	public abstract List<Class<? extends Pet>> types();
	public  Pet randomPet() {
		int n = rand.nextInt(types().size());
		try {
			return types().get(n).newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		return null;
	}
	public Pet[] getPets(int size) {
		Pet[] pets = new Pet[size];
		for(int i = 0; i < size; i++) {
			pets[i] = randomPet();
		}
		return pets;
	}
	public List<Pet> getListPet(int size){
		List<Pet> petList = new ArrayList<Pet>();
		Collections.addAll(petList, getPets(size));
		return petList;
	}
}
