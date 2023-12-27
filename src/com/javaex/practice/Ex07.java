package com.javaex.practice;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
	//나이를 입력받아 아래와 같이 입장료가 출력되도록 프로그램을 작성하시오
	//스캐너 새로 작성
		Scanner sc = new Scanner(System.in);
	//나이 입력 안내문구 출력
		System.out.println("나이를 입력해주세요.");
		System.out.println("나이: ");
		int age = sc.nextInt();
	//입력된 나이에 따른 조건문 작성
		if(age<=7) {
			System.out.println("취학전아동/"+"/무료입니다.");
		}
		else if(age<=13) {
			System.out.println("초등학생/"+"/2000원 입니다.");
		}
		else if(age<=16) {
			System.out.println("중학생/"+"/3000원 입니다.");
		}
		else if(age<=19) {
			System.out.println("고등학생/"+"/4000원 입니다.");
		}
		else {
			System.out.println("성인/"+"/5000원 입니다.");
		}
	
	//스캐너 종료
		sc.close();
	
		
		
	}

}
