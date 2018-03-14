package test;

/**
 * 测试------编译期、运行期、静态块执行顺序
 * @author Elvis
 *
 */

//执行顺序:编译期---->静态块---->运行期

public class CompilConstant {
	// 静态块
	static {
	  System.out.println("Class Test Was Loaded !");
	}
	// 编译期常量
	public static final int A =10;
	// 运行期常量
	public static final int C = "test".length();
	// 编译期   static 修饰
	public static int B = 5;
	
	public int D = 6;
	// static 修饰 可直接通过类名.常量,未修饰的 必须通过对象.常量
	
}
