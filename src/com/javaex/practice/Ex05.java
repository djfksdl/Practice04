package com.javaex.practice;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		// 5개의 숫자를 키보드로 입력받아 평균을 구하는 프로그램을 작성하세요.
		
		Scanner sc = new Scanner(System.in);
		
		int[] sArray = new int[5];
		int sum = 0;
		double average = 0;
		for(int i = 0; i<sArray.length; i++) {
			sArray[i] = sc.nextInt();

			sum = sum + sArray[i];
			
			average = sum / sArray.length;
			
		}System.out.println("평균은 " + average + "입니다.");

		
		
		sc.close();
	}
}
