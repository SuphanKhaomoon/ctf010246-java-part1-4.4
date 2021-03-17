package CTF01.Java.part1.No4_4;

import java.util.Scanner;

public class Lab678
{

	public static void main(String[] args)
	{
		System.out.println("Lab 6 ทำพร้อมๆกัน While Loop");
//		1.แสดงค่า i ในแต่ละรอบ โดยการประกาศตัวแปร i มาใช้ในการนับ ในเงื่อนไขของ
//		while ถ้าหาก i น้อยกว่าหรือเท่ากับ 10 while (i <= 10) แสดงค่า i ออกมาแต่ละรอบ
		int i = 0;
		System.out.print("1. ค่า i แต่ละรอบได้แก่ : ");
		while ( i <=10)
		{
			System.out.print(i + " ");
			i++;
		}
		System.out.println();
		
//		2.สร้างโปรแกรมหาผลรวมของตัวเลข 1 ถึง 10
		i = 1;
		int sum = 0;
		while (i <= 10)
		{
			sum += i;
			i++;
		}
		System.out.println("2. ผลรวมของตัวเลข 1 ถึง 10 = " + sum);
		
//		3.สร้างโปรแกรมหาค่าระหว่าง 1-100 ที่หาร 12 ลงตัว
		System.out.print("3. ค่าระหว่าง 1-100 ที่หาร 12 ลงตัว คือ ");
		i = 1;
		while ( i <= 100)
		{
			if ( i % 12 == 0) {
				System.out.print(i + " ");
			}
			i++;
		}
		System.out.println();
		
//		4.ให้ประกาศ array ที่มีค่า [1,2,3,4,5] แล้วใช้ foreach ในการวน loop แล้ว
//		print ค่าออกมาทั้งหมด
		System.out.print("4. ค่าจาก foreach ที่ถูก print คือ ");
		int array[] = {1,2,3,4,5};
		for (int print : array)
		{
			System.out.print(print + " ");
		}
		System.out.println();
		
		
		System.out.println("Lab 7 Do While Loop");
//		1.print ค่าตัวเลข 20 โดยเริ่มจากมากไปน้อย
		System.out.print("1. ค่าที่ print คือ ");
		i = 20;
		do {
			System.out.print(i + " ");
			i--;
		} while (i >= 1);
		System.out.println();
		
//		2.เขียนโปรแกรมตรวจสอบตัวเลข ว่าเป็นจำนวนคู่ หรือจำนวนคี่ โดยโปรแกรมจะทำงานใน
//		ลูปเรื่อยๆ ถ้าหากเขายังคงกรอกเลขคู่ แต่ถ้ากรอกเลขคี่จะเป็นการออกจากลูป
		System.out.print("2 ");
		Scanner sc = new Scanner (System.in);
		int number;
		do {
			System.out.print("กรุณากรอกตัวเลขจำนวนเต็ม : ");
			number = sc.nextInt();
		} while (number % 2 == 0);
		sc.close();
		
		System.out.println("Lab 8 Break กับ For");
//		1.กำหนดตัวแปร count สำหรับนับจำนวนรอบ
//			a. count = 20
//			b. ถ้า count มีค่าเป็น 11 คำสั่ง break ภายใน if จะทำงาน
//			c. ให้แสดงค่า 11 และออกจาก loop โดยไม่ทำคำสั่งด้านล่างต่อ
		System.out.print("1. เริ่ม count จำนวน 20 รอบ : ");
		for (int count = 0; count < 20; count++)
		{
			if (count == 11)
			{
				System.out.println( count);
				break;
			}
			System.out.print(count + " ");
		}
		
	}

}
