package com.javaex.practice;

import java.util.Scanner;

public class Ex13 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("숫자를 입력해 주세요");
		System.out.print("숫자: ");
		int num = sc.nextInt();

		double result01;  // num <= 0
		double result02;  // num > 0

		if ( num <= 0 ) {
			result01 = Math.pow(num, 3) - 9 * num + 2;
			System.out.println(result01);	
		} else {
			result02 = 7 * num + 2;
			System.out.println(result02);
		}

		sc.close();
	}

}
