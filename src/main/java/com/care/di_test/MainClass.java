package com.care.di_test;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		String path = "classpath:application_test.xml";
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext(path);
		
		//xml ���Ͽ��� ������ bean �̸�
		PrintBean pb = ctx.getBean("printb", PrintBean.class);
		
		//pb.setPrint("test ����Ʈ");
		pb.PrintString();
	}
}
