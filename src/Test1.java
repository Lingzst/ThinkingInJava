
public  class Test1 {
//	public int a = 1;
//	int b = 2 ;
//	static String str = "Tes1";
//	public void test() {
//		
//	}
//	public static void main(String[] args) {
//		try {
//			Class.forName(str);
//		} catch (ClassNotFoundException e) {
//			System.out.println("what");
//		}
//	}
	
	private int a;
	private int b=123131231;
	public Test1(int a) {
		this.a = a;
	}
	public int test() {
		return a - 1;
	}
	public int exten() {
		return b;
	}
	public static void main(String[] args) {
		
		System.out.println(System.getProperty("user.dir"));	//为什么cmd单独运行的结果是C:\Users\Jaxier\git\ThinkingInJava\src
		System.out.println(System.getProperty("user.home"));
	}
}
