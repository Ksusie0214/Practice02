package com.javaex.practice;

import java.util.Scanner;

public class Ex23 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("태어난 년도를 입력해주세요");
		System.out.println("년도: ");
		int year = sc.nextInt();
		System.out.println("올해 : 2023");
		System.out.println("태어난해: "+year);
		int age = 2023-year;
		System.out.println("나이: "+age);
		System.out.println("=================================");
		
		if(age>=20) {
			if(age>=40) {
				if (age%2==0) {
					System.out.println("20살 이상");
					System.out.println("건강검진해");
					System.out.println("암검사O");
				}
				else {
					System.out.println("20살 이상");
					System.out.println("건강검진해 아님");
					System.out.println("암검사O");
				}
			}
			else {
				if (age%2==0) {
					System.out.println("20살 이상");
					System.out.println("건강검진해");
					System.out.println("암검사X");
				}
				else {
					System.out.println("20살 이상");
					System.out.println("건강검진해 아님");
					System.out.println("암검사 X");
				}
			}
			
		}
		else {
			System.out.println("20살 미만 건강검진대상이 아님");
		}
		
		sc.close();
		
		
	}
}
