package com.javaex.practice;

import java.util.Scanner;

public class Ex14 {
	public static void main(String[] args) {
		//사번(양의 정수) 를 입력하면 팀을 확인할 수 있는 프로그램을 작성하시오
		//팀은 A, B, C팀 3개의 팀으로 구성한다
		//사번은 3으로 나누어서 나머지가 0이면 A팀, 1이면 B팀, 2이면 C팀으로 구분한다.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("사번(정수)를 입력해주세요");
		System.out.println("사번: ");
		int num = sc.nextInt();
		int result = num%3;
		
		switch(result) {
		case 0 : System.out.println("A팀입니다.");
		break;
		case 1 : System.out.println("B팀입니다.");
		break;
		case 2 : System.out.println("C팀입니다.");
		break;
		
		
		
	}
		sc.close();
}
}
