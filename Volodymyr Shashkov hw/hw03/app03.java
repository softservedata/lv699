package com.softserve.hw03;

import java.util.Scanner; // ������ �������

class app03 {
	public static void main(String args[])
	{

		System.out.println("��� ���������� ������� ������ ��������� ������ ����� � ��� ��������:");
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("������� ������ ��� ����� �1 � ���/��_");
		double c1 = scan.nextDouble();
		System.out.print("��� ������� t1 � ��_ ");
		double t1 = scan.nextDouble();
		
		System.out.print("������� ������ ��� ����� �2 � ���/��_");
		double c2 = scan.nextDouble();
		System.out.print("��� ������� t2 � ��_ ");
		double t2 = scan.nextDouble();
		
		System.out.print("������� ������ ��� ����� �3 � ���/��_");
		double c3 = scan.nextDouble();
		System.out.print("��� ������� t3 � ��_");
		double t3 = scan.nextDouble();
		
		System.out.println ("�� �����:");
		System.out.println("����� ��� �1=" + c1 + " ���/��; ��� ������� t1=" + t1 + " ��;");
		System.out.println("����� ��� �2=" + c2 + " ���/��; ��� ������� t1=" + t2 + " ��;");
		System.out.println("����� ��� �3=" + c3 + " ���/��; ��� ������� t1=" + t3 + " ��;");
	    System.out.println ("��� ������������ �������� Enter");
	    
		double Cost1=c1*t1;
		double Cost2=c2*t2;
		double Cost3=c3*t3;
		double CostTotal=Cost1+Cost2+Cost3;
		
		System.out.println ("���������:");
		System.out.println("������� ������� � ����� �1 ������: " + Cost1 + " ���.");
		System.out.println("������� ������� � ����� �2 ������: " + Cost2 + " ���.");
		System.out.println("������� ������� � ����� �3 ������: " + Cost3 + " ���.");
		System.out.println ("������� ������� �� �� ������� ������: "+CostTotal+" ���.");
	}
}