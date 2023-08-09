
public class EnhanceSwitch {

	public static void main(String[] args) {
		String dayOfWeek="MONDAY";
		boolean freeDay = switch (dayOfWeek) {
	    case "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY" -> false;
	    case "SATURDAY", "SUNDAY" -> true;
		default -> throw new IllegalArgumentException("Unexpected value: " + dayOfWeek);
	};
	System.out.println(freeDay);
		
	}

}
