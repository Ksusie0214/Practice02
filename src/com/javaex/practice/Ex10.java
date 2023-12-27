package com.javaex.practice;

import java.util.Scanner;

public class Ex10 {
	public static void main(String[] args) {
	//두개의 숫자를 입력받아 큰 수와 작은 수를 분류하여 출력하시오
	Scanner sc = new Scanner(System.in);
	System.out.println("숫자 2개를 입력해주세요");
	System.out.print("숫자1: ");
	int num1 = sc.nextInt();
	System.out.print("숫자2: ");
	int num2 = sc.nextInt();
	
	if(num1>num2) {
		
		System.out.println("큰 수: "+num1+"작은 수: "+num2+ " 입니다.");
	}
	else {
		System.out.println("큰 수: "+num2+"작은 수: "+num1+ " 입니다.");
	}
	
	sc.close();
	
	}
}
