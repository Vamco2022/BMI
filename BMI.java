package BMI;

import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double height=sc.nextDouble();
		int weights=sc.nextInt();
		double weight=weights/2;
		double bmi=weight/(height*height);
		System.out.println("��������"+height+"��");
		System.out.println("���������"+weight+"ǧ��");
		System.out.println("���BMI��"+bmi);
		if (bmi < 18.5) {
			System.out.println("̫����");
		}
		if (bmi >= 18.5 && bmi < 24.9) {
			System.out.println("��������");
		}
		if (bmi >= 24.9) {
			System.out.println("̫����");
		}
		sc.close();
		}

}
