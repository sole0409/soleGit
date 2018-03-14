package test;

public class DE {
	public static void main(String[] args) {
		String a = "201409233718604626-1";
		String b = a.substring(0, a.indexOf("-"));
		String c = a.substring(a.indexOf("-")+1);
		System.out.println(b);
		System.out.println(c);
	}

}
