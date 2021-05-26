package com.javaex.practice;

import java.util.Scanner;

public class Ex12 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("출력되는 내용을 입력하세요");
		System.out.print("기호: ");
		String oper = sc.nextLine();
		System.out.print("숫자1: ");
		int num01 = sc.nextInt();
		System.out.print("숫자2: ");
		int num02 = sc.nextInt();

		System.out.print("결과는: ");

		switch (oper) {
		case "%":
			System.out.println("계산할 수 없는 기호입니다.");
			break;
		case "+":
			System.out.println((double)num01 + (double)num02);
			break;				
		case "-":
			System.out.println((double)num01 - (double)num02);
			break;
		case "*":
			System.out.println((double)num01 * (double)num02);
			break;
		case "/":
		{
			switch(num02)
			{
			case 0:
				System.out.println("계산할 수 없습니다.");
				break;
			default:
				System.out.println((double)num01 / (double)num02);
				break;
			}
		}

		}

		sc.close();

	}

}
