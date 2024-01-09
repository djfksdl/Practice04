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
		// 50000원짜리들은 2개가 나올 수 없다. 나올 수 있는 값은 1 또는 0
		// 10000원짜리들은 0~4개가 나올 수 있다.
//		int count;
//		for(int i =0; i<wonArray.length; i++) {
//			if(i%2==0) {
//				count = money/wonArray[i];
//			}else {
//				count = money%wonArray[i-1];
//			}
//			System.out.println(wonArray[i] + "원: " + count + "개");
//		}

/*		wonArray[0] =50000원 = money/wonArray[0] =m0
 * 		wonArray[1] =10000원 = money%wonArray[0]/10000(10*10*10*10) = m1
 * 		wonArray[2] =5000원 = {money -(50000*m0 + 10000*m1)}/wonArray[2] =m2
 * 		wonArray[3] =1000원 = {money -(50000*m0 + 10000*m1)}%wonArray[2]/1000(10*10*10) =m3
 * 		wonArray[4] =500원 = {money -(50000*m0 + 10000*m1 + 5000*m2 + 1000*m3)}/wonArray[4] = m4
 * 		wonArray[5] =100원 = {money -(50000*m0 + 10000*m1 + 5000*m2 + 1000*m3)}%wonArray[4]/100(10*10) = m5
 * 		wonArray[6] =50원 = {money-(50000*m0 + 10000*m1 + 5000*m2 + 1000*m3 + 500*m4 +100*m5)}/wonArray[6] = m6
 * 		wonArray[7] =10원 = {money-(50000*m0 + 10000*m1 + 5000*m2 + 1000*m3 + 500*m4 +100*m5)}%wonArray[6]/10(10*1) = m7
 * 		wonArray[8] =5원 = {money-(50000*m0 + 10000*m1 + 5000*m2 + 1000*m3 + 500*m4 +100*m5 + 50*m6 + 10*m7)}/wonArray[8] = m8
 * 		wonArray[9] =1원 = {money-(50000*m0 + 10000*m1 + 5000*m2 + 1000*m3 + 500*m4 +100*m5 + 50*m6 + 10*m7)}*wonArray[8]/1(10*0)) = m9
 * 
 * 		{money -(50000*m0 + 10000*m1 + 5000*m2 + 1000*m3 + 500*m4 +100*m5 + 50*m6 + 10*m7)} /wondArray[i] = seek
 * 
 * 		50000원 = money/wonArray[0]
 * 		10000원 = money%wonArray[0]
 * */
//		wonArray[0] = money/wonArray[0];
//		wonArray[1] = money - 
		
//		System.out.println(wonArray[0] + "원: " + money/wonArray[0] +"개");
//		System.out.println(wonArray[1] + "원: " + (money%wonArray[0])/10000 + "개");
//		System.out.println(wonArray[2] + "원: " + (money/wonArray[2])/10+ "개");
//		System.out.println(wonArray[3] + "원: " + (money%wonArray[2])/1000 + "개");
//		System.out.println(wonArray[4] + "원: " + (money/wonArray[4])+ "개");
//		System.out.println(wonArray[5] + "원: " + (money%wonArray[4])/100 + "개");
//		System.out.println(wonArray[6] + "원: " + (money/wonArray[6]) + "개");
//		System.out.println(wonArray[7] + "원: " + (money%wonArray[6])/10 + "개");
//		System.out.println(wonArray[8] + "원: " + (money/wonArray[8]) + "개");
//		System.out.println(wonArray[9] + "원: " + money%wonArray[8] + "개");
		
		sc.close();
	}
}
