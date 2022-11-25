package com.ho.easyMaintance;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class EMain2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BufferedReader br = null;
		try {
			System.out.print("구매한 물건 가격 : ");
			int price = sc.nextInt();
			FileReader fr = new FileReader("D:/point.txt");
			br = new BufferedReader(fr);
			String point = br.readLine();
			double point2 = Double.parseDouble(point);
			double result = price * point2;
			System.out.println("--------------");
			System.out.printf("포인트 : %.0f\n", result);
			Thread.sleep(5000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		sc.close();
	}
}
