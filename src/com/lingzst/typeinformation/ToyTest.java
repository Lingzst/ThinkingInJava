package com.lingzst.typeinformation;

interface HasBatteries{}
interface WaterProof{}
interface Shoots{}

class Toy {
	Toy() {}
	Toy(int i){}
}
class FancyToy extends Toy implements HasBatteries, WaterProof, Shoots {
	public FancyToy() {
		super(1);
	}
}
public class ToyTest  {
	static void printInfo(Class<?> cc) {
		System.out.println("Get Class Name:" + cc.getName());
		System.out.println("is interface: " + cc.isInterface());
		System.out.println("Simple Name: " + cc.getSimpleName());
	}
	public static void main(String[] args) {
		Class<?> c = null;
		try {
			c = Class.forName("com.lingzst.typeinformation.FancyToy");
		} catch (ClassNotFoundException e) {
			System.out.println("can't find fancytoy");
			System.exit(1);
		}
		printInfo(c);
		Class<?>[] interfaces = c.getInterfaces();
		for(Class<?> cl : interfaces) {
			printInfo(cl);
		}
		Class<?> superclass = c.getSuperclass();
		Class<?> testsuperClass = c.getSuperclass();
		System.out.println("----------" + superclass.getClass().getName() + "@" + Integer.toHexString(superclass.hashCode()));
		System.out.println("-------fef---" + testsuperClass.getClass().getName() + "@" + Integer.toHexString(testsuperClass.hashCode()));

		Object obj = null;
		try {
			Object newInstance = superclass.newInstance();
		} catch (InstantiationException e) {
			System.out.println("can't instantiate");
			System.exit(1);
		} catch (IllegalAccessException e) {
			System.out.println("can't access");
			System.exit(1);
		}
		System.out.println("----------" + obj.getClass().getName() + "@" + Integer.toHexString(obj.hashCode()));
		System.out.println(obj.getClass());
	}
}
