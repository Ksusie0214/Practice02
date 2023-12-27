package com.javaex.practice;

import java.util.Scanner;

public class Ex18 {
	public static void main(String[] args) {
		//알파벳을 입력받아 자음 모음을 구분하세요
		
		Scanner sc = new Scanner(System.in);
		System.out.println("알파벳 1글자(소문자) 를 입력하세요.");
		System.out.println("알파벳: ");
		String alphabet = sc.nextLine();
		
		switch (alphabet) {
		
		case "a","e","i","o","u":{
			System.out.println("모음입니다.");
		}
		case "b", "c", "d", "f", "g", "h", "j","k","l","m","n","p","q","r","s","t","v","w","x","y","z" :{
			System.out.println("자음입니다.");
		}
		
		
		
		}
		
		sc.close();
		
	}

}
