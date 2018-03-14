package test;
/**
 * 静态代码块/静态成员变量 > 构造代码块/成员变量 > 构造方法
 * @author Elvis
 *
 */
public class D {
	
	// 类加载的时候就执行
	static{
		System.out.println("static");
	}
	public static final int A = 4;
	public  int c = 4;
	{
		System.out.println("1");
	}
	D(){
		System.out.println("无参构造");
	}
	D(String str){
		System.out.println("有参构造"+":"+str);
	}
	public static void main(String[] args) {
		System.out.println(D.A);
		D d = new D("666");
		System.out.println(d.c);
		// 输出顺序    static  4  1   有参构造:666 4 
	}

}
