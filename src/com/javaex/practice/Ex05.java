package com.javaex.practice;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		//보기와 같은 형식으로 나이가 입력되었을 때 결과값을 예상하여 작성해보세요.
		
		int age; //나이
		
		Scanner sc = new Scanner(System.in);
		
		//나이 입력
		System.out.println("나이를 입력해주세요");
		System.out.println("나이: ");
		age = sc.nextInt();
		
		//그룹 분류
		if (age > 20) {//20살을 초과하면
			System.out.print("\"1번 그룹\"");
		}else {//20살 이하이면
			System.out.println("\"2번 그룹\"");
		}
		System.out.println("입니다.");
		
		sc.close();
		/*
		 (1)15일 때 결과 : 20살 이하이므로 2번이다.
		 (2)19일 때 결과 : 20살 이하이므로 2번이다.
		 (3)20일 때 결과 : 20살 이하이므로 2번이다.
		 (4)21일 때 결과 : 20살 초과이므로 1번이다.
		 (5)100일 때 결과 : 20살 초과이므로 1번이다.
		 */
		
	}

}
