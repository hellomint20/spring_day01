package com.care.di02;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Mainclass {
	public static void main(String[] args) {
		//classpath : resources 폴더를 지칭하는 문법
		String path = "classpath:applicationST.xml"; //경로 지정
		
		//path의 파일을 실행하고 해당 bean 값을 ioc컨테이너에 등록
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext(path);
		
		//xml에서 설정한 값, 해당하는 자료형
		STBean stb = ctx.getBean("stb", STBean.class );
		//stb.setName("안녕");
		//stb.setAge(25);
		
		stb.namePrint();
		stb.agePrint();
	}
}
