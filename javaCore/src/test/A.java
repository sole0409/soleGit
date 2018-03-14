package test;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class A {

	public static void main(String[] args) {
		/*String s = "<p>we are shsjssjksje</p><br/>";
		String[] b = s.replaceAll("<br/>","").trim().split("<p>");
		System.out.println(b.length);
		System.out.println(b[0]+""+b[1]);*/
		
		// 通过域名----获取服务器主机IP
		try{
		   InetAddress addr = InetAddress.getByName("www.sinovatech.com");
		   String domainName = addr.getHostName();//获得主机名
	       String IP = addr.getHostAddress();//获得IP地址
	       System.out.println(domainName);
	       System.out.println(IP);
	    }catch(UnknownHostException e){
	       e.printStackTrace();
	    }
	}

}
