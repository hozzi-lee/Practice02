package com.javaex.practice;

// import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {

		int age = 15;
		// age가 0살 초과이고 18살 미만 이면
		if ( 0 < age && age < 18 ) { // ( 0 < age < 18 ) 에서 수정 
			System.out.println("청소년 입니다.");
		}

		/* 방법 - 2 if값 나누기

		int age = 15;
		// age가 0살 초과이고 18살 미만 이면
		if ( 0 < age ) { 
			System.out.println("청소년 입니다.");
		} else if ( age < 18 ) {
			System.out.println("청소년 입니다.");
		}
		 */

		/* 방법 - 3 Scanner사용 입력칸 만들기

		Scanner sc = new Scanner(System.in); // 추가

		int age = sc.nextInt(); // 추가
		// int age = 15; // 삭제
		// age가 0살 초과이고 18살 미만 이면
		if ( 0 < age && age < 18 ) { // ( 0 < age < 18 ) 에서 수정 
			System.out.println("청소년 입니다.");
		} else {
			System.out.println("성인 입니다.");
		}

		sc.close(); // 추가
		 */
	}

}
