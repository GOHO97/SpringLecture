package com.ho.easyMaintance;

import java.util.Scanner;

public class EMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("구매한 물건 가격 : ");
		int totalPrice = sc.nextInt();
		System.out.println("-----------------------");
		double savePoint = totalPrice / 0.005;
		System.out.printf("적립 되는 포인트 : %.0f\n", savePoint);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		sc.close();
	}
}
