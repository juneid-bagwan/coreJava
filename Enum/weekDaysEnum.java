package Enum;

public class weekDaysEnum {
	enum days {
		MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
	}

	public static void main(String[] args) {
		days d;
		d = days.WEDNESDAY;
		
		switch (d) {

		// Case statements
		case MONDAY:
			System.out.println("start working");
			break;
		case TUESDAY:
			System.out.println("staring of bad days");
			break;
		case WEDNESDAY:
			System.out.println("wednes day is worst");
			break;
		case THURSDAY:
			System.out.println("thursday is bad ");
			break;
		case FRIDAY:
			System.out.println("today is friday");
			break;
		case SATURDAY:
			System.out.println("holiday");
		case SUNDAY:
			System.out.println("last holiday");
			break;
		
		}

	}

}
