package com.care.di;

public class MainClass {
	public static void main(String[] args) {
		STBean stBean = new STBean();
		stBean.setName("�ȳ�");
		stBean.setAge(20);
		stBean.setSt(new Student());
		
		stBean.namePrint();
		stBean.agePrint();
	}
}
