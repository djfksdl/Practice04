package com.javaex.practice;

public class Ex01 {
	public static void main(String[] args) {
		int[] intArray = new int[5];
		intArray[0] = 3;
		intArray[1] = 7;
		intArray[2] = 12;
		
		int result = 0;
		
		for (int i = 0; i<intArray.length; i++) {
			result = result + intArray[i];
		}
		System.out.println(result);
		
	}
}

// 오류가 나는 이유? : intArray가 5자리인 배열인데 for문에서 i 범위가 그 범위를 넘어서!