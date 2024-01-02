package com.javaex.practice;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		//??
		int[] wonArray = new int[10];
		wonArray[0] = 50000;
		wonArray[1] = 10000;
		wonArray[2] = 5000;
		wonArray[3] = 1000;
		wonArray[4] = 500;
		wonArray[5] = 100;
		wonArray[6] = 50;
		wonArray[7] = 10;
		wonArray[8] = 5;
		wonArray[9] = 1;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("금액: ");
		int money = sc.nextInt();
		/*
		 * 67879
		50000원 : 1 (67879/50000 =1) 
		10000원 : 1 (67870%50000 = 17879)
		5000원: 1 (7870/5000 = 1)
		1000원: 2 (7870%5000 = 2879)
		500원: 1 (879/500 = 1)
		100원:3 (879%500 = 379)
		50원:1 (79/50 = 1)
		10원:2 (79%50 = 29)
		5원:1 (9/5 = 1)
		1원:4 (9%5 = 4) 	
		 * */
		System.out.println(wonArray[0] + "원: " + money/wonArray[0] +"개");
		System.out.println(wonArray[1] + "원: " + (money%wonArray[0])/10000 + "개");
		System.out.println(wonArray[2] + "원: " + (money/wonArray[2]) + "개");
		System.out.println(wonArray[3] + "원: " + (money%wonArray[2])/1000 + "개");
		System.out.println(wonArray[4] + "원: " + (money/wonArray[4]) + "개");
		System.out.println(wonArray[5] + "원: " + (money%wonArray[4])/100 + "개");
		System.out.println(wonArray[6] + "원: " + (money/wonArray[6]) + "개");
		System.out.println(wonArray[7] + "원: " + (money%wonArray[6])/10 + "개");
		System.out.println(wonArray[8] + "원: " + (money/wonArray[8]) + "개");
		System.out.println(wonArray[9] + "원: " + money%wonArray[8] + "개");
		
		sc.close();
	}
}
