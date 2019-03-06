package com.lingzst.typeinformation;

import java.util.*;

public class PetCount {
	static class PetCounter extends HashMap<String, Integer>{
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		public void count(String type) {
			Integer quantity = get(type);
			if(quantity == 0)
				put(type, 1);
			else
				put(type, quantity + 1);
		}
	}
}
