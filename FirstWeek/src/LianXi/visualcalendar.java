package LianXi;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class visualcalendar {
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("�밴�����¸�ʽ�������ڣ�2011-11-11");
		String input1 =scanner.next();
		String temp =input1;
		DateFormat format= new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date date= format.parse(temp);
			Calendar calendar =new GregorianCalendar();
			calendar.setTime(date);
			calendar.set(Calendar.DATE, 1);
			//System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
			int maxDate=calendar.getActualMaximum(Calendar.DATE);
		//	System.out.println(calendar.getActualMaximum(Calendar.DATE));
			System.out.println("��\tһ\t��\t��\t��\t��\t��");
			for(int i=0;i<calendar.get(Calendar.DAY_OF_WEEK)-1;i++) {
				System.out.print("\t");
				
			}
			int j=0;
			for(int i=1;i<=maxDate;i++){
				System.out.print(i+"\t");

				j++;
				int w=calendar.get(Calendar.DAY_OF_WEEK);
				if(w==Calendar.SATURDAY) {
					System.out.println();
				}	
				calendar.add(calendar.DATE, 1);
			}
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
