package com.care.di_test;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		String path = "classpath:application_test.xml";
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext(path);
		
		//xml 파일에서 설정한 bean 이름
		PrintBean pb = ctx.getBean("printb", PrintBean.class);
		
		//pb.setPrint("test 프린트");
		pb.PrintString();
	}
}
