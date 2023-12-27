package com.javaex.practice;

import java.util.Scanner;

public class Ex08 {
	
	public static void main(String[] args) {
		//사용자가 키와 몸무게를 입력받아 표준체중을 계산한 후에
		//저체중, 표준, 과체중을 구분하여 출력하는 프로그램을 작성하시오.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("키와 몸무게를 입력하세요");
		System.out.println("키: ");
		int height = sc.nextInt();
		System.out.println("몸무게: ");
		int weight = sc.nextInt();
		
		double result = (height-100)*0.9;
		
		if(weight < result) {
			System.out.println("저체중 입니다.");
		}
		else if(weight == result) {
			System.out.println("표준 입니다.");
		}
		else {
			System.out.println("과체중 입니다.");
		}
		
		System.out.println("표준체중: "+ result);
		
		sc.close();
	}

}
