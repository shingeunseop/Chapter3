package com.javaex.ex02;

public class StringApp {

	public static void main(String[] args) {
		
		String a= new String(" abcd");
		String b= new String(",cfg");
		
		//문자열 연결
		a=a.concat(b);
		System.out.println("concat():"+a);
		
		//공백제거
		a=a.trim();
		System.out.println("trim():"+a);
		
		//문자열 치환
		a=a.replace("ab", "12");
		System.out.println("replace():"+a);
		
		//문자열 분리
		String s[]=a.split(",");
		for(int i=0;i<s.length;i++) {
			System.out.println("[]:"+s[i]);
		}
		System.out.println(a);
		
		//문자열뽑기
		a=a.substring(1, 6);//1~6번째 전 단락빼고 없애기
		System.out.println("substring():"+a);
		
		//문자뽑기
		char c=a.charAt(2);
		System.out.println("charAt():"+c);
		
		a.toUpperCase();
		System.out.println("toUpperCase():"+a);

	}

}
