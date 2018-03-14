package test;

public class SupClass {
	public static int a = 3;
	static{
        System.out.println("supclass init§‹-------->");
    }
	public static void main(String[] args) {
		System.out.println(SupClass.class);
	}
}
