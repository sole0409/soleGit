package test;

public class ConstructorDemo {
	{  
        System.out.println("测试构造代码块++++++++a");  
    }  
      
    private B classTestA = new B();  
      
    static {  
        System.out.println("测试类静态代码块1");  
    }  
      
    private static B classTestB = new B("classTestB");   
      
    {  
        System.out.println("子类构造代码块2");  
    }  
      
    static {  
        System.out.println("子类静态代码块2");  
    }  
      
    public ConstructorDemo() {  
        System.out.println("子类无参构造函数");  
    }  
    
    public static void main(String[] args) {  
        ConstructorDemo demo = new ConstructorDemo();  
    }  
}
