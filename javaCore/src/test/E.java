package test;

import java.text.DateFormat;
/**
 * λ����
 * @author Elvis
 * &(��λ��)��|(��λ��)��^(��λ���)��~ (��λȡ��)
 */
public class E {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		DateFormat df = DateFormat.getDateInstance();
		// &(��λ��) 
		System.out.println((2&2));
		// |(��λ��)
		System.out.println((2|1));
		// ^(��λ���)
		System.out.println((2^1));
		// ~(��λȡ��) �������  = -1
		System.out.println((~(-4)));
		
		String a = "123";
		String b = new String("123");
		System.out.println(a == b);
	}

}
