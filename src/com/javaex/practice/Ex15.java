package com.javaex.practice;

import java.util.Scanner;

public class Ex15 {
	
	public static void main(String[] args) {
		//내용과 같은 계산기 프로그램을 작성하시오
		
		Scanner sc = new Scanner(System.in);
		System.out.println("출력되는 내용을 입력하세요");
		System.out.println("기호: ");
		String sign = sc.nextLine();
		System.out.println("숫자1: ");
		int num1 = sc.nextInt();
		System.out.println("숫자2: ");
		int num2 = sc.nextInt();
		
		switch(sign) {
		case "+":{
			double add = num1+num2;
			System.out.println("결과는 "+add);
		}
		case"-":{
			double minus = num1-num2;
			System.out.println("결과는 "+minus);
		
		}
		case"*":{
			double multiply = num1*num2;
			System.out.println("결과는 "+ multiply);
		
			}
		case"/":{
			double devide = num1/num2;
			if(devide==0) {
				System.out.println("계산할 수 없습니다.");}
			else {
				System.out.println("결과는 "+devide);
			}		
			}
		default:System.out.println("계산할 수 없는 기호입니다.");
		}
		sc.close();
	}
}

