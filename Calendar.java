package leetcode;

import java.time.*;

public class Calendar {
	
    LocalDate date = LocalDate.of(1947, 8, 15);
    DayOfWeek dow = DayOfWeek.from(date);
    

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar c = new Calendar();
		System.out.println(c.dow.name());
	}

}
