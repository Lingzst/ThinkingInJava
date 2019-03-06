import java.lang.reflect.Method;

import com.lingzst.typeinformation.A;
import com.lingzst.typeinformation.HiddenC;

public class HiddenImplementation {
	public static void main(String[] args) {
		A a = HiddenC.makeA();
		a.f();
		a.g();
		runHiddenMethod(a, "u");
	}

	public static void runHiddenMethod(Object obj, String methodName) {

		try {
			Method declaredMethod = obj.getClass().getDeclaredMethod(methodName);
			declaredMethod.setAccessible(true);
			declaredMethod.invoke(obj);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
