package test;

/**
 * ����------�����ڡ������ڡ���̬��ִ��˳��
 * @author Elvis
 *
 */

//ִ��˳��:������---->��̬��---->������

public class CompilConstant {
	// ��̬��
	static {
	  System.out.println("Class Test Was Loaded !");
	}
	// �����ڳ���
	public static final int A =10;
	// �����ڳ���
	public static final int C = "test".length();
	// ������   static ����
	public static int B = 5;
	
	public int D = 6;
	// static ���� ��ֱ��ͨ������.����,δ���ε� ����ͨ������.����
	
}
