package com.javaex.practice;

public class Ex08 {
	public static void main(String[] args) {
		//?? 배열을 사용하여 1~45까지의 숫자 중 임의의 6개의 숫자를 출력하세요-미니로또(중복체크 할 것)
		
		int[] lottoArray = new int[6];
		
		for(int i = 0; i<lottoArray.length; i++) {
			lottoArray[i] = (int)(Math.random()*45)+1;
			if(lottoArray[i] == lottoArray[i+1]) {
				System.out.println(lottoArray[i]);				
			}
		}
	}
}
