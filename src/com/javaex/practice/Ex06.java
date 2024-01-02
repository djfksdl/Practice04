package com.javaex.practice;

public class Ex06 {
	//주어진 문자열의 공백을 ‘,’(콤마) 로 변경 후 출력하세요
	public static void main(String[] args) {
		char[] c = {'T','h','i','s',' ','i','s',' ','a',' ','p','e','n','c','i','l'};
		
		for(int i = 0; i <c.length; i++) {
			if(c[i] == ' ') {
				c[i] = ',';
			}System.out.print(c[i]);
			
			// char는 ==, String은 equals()사용하여 변수 비교
		}
	}
	
}
