package com.javaex.practice;

import java.util.Scanner;

public class Ex22 {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 3개를 입력해주세요");
		System.out.println("숫자1: ");
		int num1 = sc.nextInt();
		System.out.println("숫자2: ");
		int num2 = sc.nextInt();
		System.out.println("숫자3: ");
		int num3 = sc.nextInt();
		
		if(num1>num2) {
			if(num2>num3) {
				System.out.println("가장 큰 수는 " + num1 + " 입니다.");
			}
			else if(num2<num3) {
				if(num1>num3) {
					System.out.println("가장 큰 수는 "+ num1 + " 입니다.");
				}
				else {System.out.println("가장 큰 수는 " + num3 + " 입니다.");}
			}
		}
		else if(num2>num1) {
			if(num2>num3) {
				System.out.println("가장 큰 수는 " + num2 + " 입니다.");
			}
			else {
				System.out.println("가장 큰 수는 " + num3 + " 입니다.");
			}
		}
		
		sc.close();
		
		
		
		
		
		
		
	}

}
