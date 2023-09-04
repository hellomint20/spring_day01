package com.care.di02;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Mainclass {
	public static void main(String[] args) {
		//classpath : resources ������ ��Ī�ϴ� ����
		String path = "classpath:applicationST.xml"; //��� ����
		
		//path�� ������ �����ϰ� �ش� bean ���� ioc�����̳ʿ� ���
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext(path);
		
		//xml���� ������ ��, �ش��ϴ� �ڷ���
		STBean stb = ctx.getBean("stb", STBean.class );
		//stb.setName("�ȳ�");
		//stb.setAge(25);
		
		stb.namePrint();
		stb.agePrint();
	}
}
