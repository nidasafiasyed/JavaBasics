package javaHW;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class DayOfWeek {
	
	private void checkDateFormat(String d, DayOfWeek day) throws DateTimeParseException {
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		LocalDate testDate = LocalDate.parse(d, formatter);
	
        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};		
		if(testDate.isBefore(LocalDate.of(1900, 03, 01)) || testDate.isAfter(LocalDate.of(2100, 02, 28))) {
			 System.out.println("Date should be between March 1900 and February 2100");
		 }
		 
		 else {
			 int da = day.numberOfDays(testDate, day);
			 System.out.println(d+" falls on a "+days[da]);
			 
		 }
			
	}
	
	
	
	private int numberOfDays(LocalDate testDate, DayOfWeek day) {
		
		int testYear =  testDate.getYear();
		int testMonth = testDate.getMonthValue();
		int yearCalc = ((testYear - 1900)*365) + ((testYear - 1900)/4);
		int daysOfYear = 0;
		
		if(testDate.isLeapYear() && (testMonth == 1 || testMonth == 2)) {
			yearCalc -=1;
		}
		
		if(testMonth == 1) {
			daysOfYear = testDate.getDayOfMonth();
		}
		
		else {
			for(int i = 1; i < testMonth; i++)
			{
				daysOfYear += LocalDate.of(1999, i, 1).lengthOfMonth();
			}
			
			daysOfYear += testDate.getDayOfMonth();
		}
		
		
		return (yearCalc+daysOfYear)%7; 
		
	}

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		DayOfWeek day = new DayOfWeek();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the date in mm/dd/yyyy format");
		
		String d = sc.next();
		
		day.checkDateFormat(d, day);
		
        
        sc.close();

	}

}
