package test;

public class B {
	{  
        System.out.println("构造代码块---------->a");  
    }  
    static   
    {  
        System.out.println("静态代码块----------->b");  
    }  
      
    public B(){  
        System.out.println("无参构造函数---------->c");  
    }  
      
    public B(String str)  
    {  
        System.out.println("父类有参构造函数" + str);  
    }  
}
