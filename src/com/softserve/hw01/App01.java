package com.softserve.hw01;

import java.util.Scanner; // ������ �������

class app01 {
	public static void main(String args[])
	{

		System.out.println("��� ���������� ����� �� ��������� ������ ���������:");
		System.out.println("������ ����� ������ �� ��������� Enter");
		System.out.print("_");

		Scanner scan = new Scanner(System.in);
		double r = scan.nextDouble();
		System.out.println ("�� ����� �����  " + r+" ��");
		System.out.println("");
		
		double P; // ��������� �����
		double S; // ��������� �����
		
		P=2*Math.PI*r;//���������� �������� ����
		S=Math.PI*Math.pow(r,2);//���������� ����� ����
		
		System.out.println ("�������� ������ ������� "+P+" ��");
		System.out.println ("����� ������ ������� "+S+" ��");
	}
}
