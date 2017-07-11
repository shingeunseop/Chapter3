package com.javaex.ex03;

public class WrapperApp {

	public static void main(String[] args) {
		
		Integer i =new Integer(10);
		Character c=new Character('c');
		Float f=new Float(3.14);
		Boolean b=new Boolean("true");
		
		System.out.println(i);
		
		Integer result=new Integer(10)+new Integer(20);
		System.out.println(result);
		
		Integer i2=10;//이것도 가능
		Double d2=3.14;
		Boolean b2=false;
		
		int i3=i2;
		double d3=d2;
		boolean b3=b2;
		
		int num=i2.parseInt("-123");
		System.out.println(num);//문자열이 들어왔는데 숫자로 바꾸는 것

		String str=String.valueOf(555);
		System.out.println(str);
		String str2=555+"";
	}

}
