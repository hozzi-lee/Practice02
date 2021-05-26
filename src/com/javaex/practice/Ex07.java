package com.javaex.practice;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("첫번째 숫자: ");
		int num01 = sc.nextInt();
		System.out.print("두번째 숫자: ");
		int num02 = sc.nextInt();

		int ahrt;
		int skajwl;

		if ( num01 > num02 ) {
			ahrt = num01 / num02;
			skajwl = num01 % num02;
			System.out.println("몫: "+ahrt+"\n나머지: "+skajwl+"");
		} else {
			ahrt = num02 / num01;
			skajwl = num02 % num01;
			System.out.println("몫: "+ahrt+"\n나머지: "+skajwl+"");
		}

		sc.close();
	}

}
