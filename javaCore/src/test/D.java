package test;
/**
 * ��̬�����/��̬��Ա���� > ��������/��Ա���� > ���췽��
 * @author Elvis
 *
 */
public class D {
	
	// ����ص�ʱ���ִ��
	static{
		System.out.println("static");
	}
	public static final int A = 4;
	public  int c = 4;
	{
		System.out.println("1");
	}
	D(){
		System.out.println("�޲ι���");
	}
	D(String str){
		System.out.println("�вι���"+":"+str);
	}
	public static void main(String[] args) {
		System.out.println(D.A);
		D d = new D("666");
		System.out.println(d.c);
		// ���˳��    static  4  1   �вι���:666 4 
	}

}
