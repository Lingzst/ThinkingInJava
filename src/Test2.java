import java.util.List;
import java.util.*;
public class Test2 extends Test1{
	
//	public static void main(String[] args) {
//		System.out.println(new Test2());
//	}
	static int a = 1;
	public Test2() {
		
		
		super(a);
	}
	public int test() {
		return super.test();
	}
	public int a(int a) {
		return a;
	}
//	public static void main(String[] args) {
//		Test2 a = new Test2();
//		int b = a.exten();
//		System.out.println(b);
//	}
	private static void specific(List<Test1> a) {
		
	}
	private static void wildcard(List<? extends Test1> b) {
		
	}
	public static void main(String[] args) {
		specific(new ArrayList<Test1>());
		
	}
	
}
