package com.javaex.practice;

public class Ex08 {
	public static void main(String[] args) {
		//??다시 배열을 사용하여 1~45까지의 숫자 중 임의의 6개의 숫자를 출력하세요-미니로또(중복체크 할 것)
		
		int[] lottoArray = new int[6];
		
		for(int i = 1; i<lottoArray.length; i++) {
			lottoArray[i] = (int)(Math.random()*45)+1;
			
			if(lottoArray[i-1] == lottoArray[i]) {
				lottoArray[i] = (int)(Math.random()*45)+1;				
			}else {
				System.out.print(lottoArray[i] + " ");
			}
		}
		
		// 중복검사
		// i 는 현재 입력된 방번호 <--중복인지 검사해야됨
		// j 비교대상 [0]부터 순서대로 검사해서 i 이전방까지 검사
		// 비교해서 같은 값 방이 나오면 뒤쪽은 검사하지 않음
		
//		for(int i = 0; i<lottoArray.length; i++) {
//			lottoArray[i] = (int)(Math.random()*45)+1;
//			
//			for(int j =0; j<i;j++) {
//				if(lottoArray[i] == lottoArray[j]) {
//					--i;
//					break;
//				}
//			}
//		}
//		for (int j = 0; j< lottoArray.length; j++) {
//			System.out.print(lottoArray[j] + " ");
//		}
	}
}
