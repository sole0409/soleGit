package test;

public class ConstructorDemo {
	{  
        System.out.println("���Թ�������++++++++a");  
    }  
      
    private B classTestA = new B();  
      
    static {  
        System.out.println("�����ྲ̬�����1");  
    }  
      
    private static B classTestB = new B("classTestB");   
      
    {  
        System.out.println("���๹������2");  
    }  
      
    static {  
        System.out.println("���ྲ̬�����2");  
    }  
      
    public ConstructorDemo() {  
        System.out.println("�����޲ι��캯��");  
    }  
    
    public static void main(String[] args) {  
        ConstructorDemo demo = new ConstructorDemo();  
    }  
}
