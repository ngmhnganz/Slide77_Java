package lop1.com.test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import lop1.com.model.person;
public class testPerson {
	private static Calendar xuLiNgaySinh(String s) {
		do {
			try {
				
				DateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
				Date dateSinh = sdf.parse(s);
				Calendar cal = Calendar.getInstance();
				cal.setTime(dateSinh);
				return cal;
			} catch (ParseException e) {
				System.out.println("Nhập sai định dạng (dd/MM/yyyy) ");
			}
			}
			while (true);
	}	
	public static void main(String[] args) {
		person a = new person();
		System.out.println("Nhập ngày sinh (dd/MM/yyyy): " );
		String s= new Scanner(System.in).nextLine();
		a.setDateOfBirth(xuLiNgaySinh(s));		
		System.out.println("Nhập tên: ");
		s=new Scanner(System.in).nextLine();
		a.setFirstname(s);
		System.out.println("Nhập postcode: ");
		s= new Scanner(System.in).nextLine();
		a.setPostcode(s);
		do
		{
			System.out.println("Nhập nhóm máu: ");
			s = new Scanner(System.in).nextLine();
			if (s.contentEquals("A")||s.contentEquals("B")||s.contentEquals("AB")||s.contentEquals("O")||s.contentEquals("a")||s.contentEquals("b")||s.contentEquals("o")||s.contentEquals("ab")) 
			{
				s=s.toUpperCase();
				a.setBloodGroup(s);
				break;
			}
		}
		while(true);
		System.out.println(a);
		}
}
