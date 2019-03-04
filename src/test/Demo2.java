package test;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		//2.	 判断平年和闰年
		//闰年：能被4整除但不能被100整除或者能被400整除。
		Scanner input = new Scanner(System.in);
		System.out.println("请输入年份：");
		System.out.println("请输入正数：");
		int year = input.nextInt();
		if(year % 4 == 0 && year % 4 != 0 || year % 400 == 0){
			System.out.println(year + "是闰年");
		}else{
			System.out.println(year + "是平年");
		}
	}

}
