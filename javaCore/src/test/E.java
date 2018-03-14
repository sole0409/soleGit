package test;

import java.text.DateFormat;
/**
 * 位运算
 * @author Elvis
 * &(按位与)、|(按位或)、^(按位异或)、~ (按位取反)
 */
public class E {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		DateFormat df = DateFormat.getDateInstance();
		// &(按位与) 
		System.out.println((2&2));
		// |(按位或)
		System.out.println((2|1));
		// ^(按位异或)
		System.out.println((2^1));
		// ~(按位取反) 两两相加  = -1
		System.out.println((~(-4)));
		
		String a = "123";
		String b = new String("123");
		System.out.println(a == b);
	}

}
