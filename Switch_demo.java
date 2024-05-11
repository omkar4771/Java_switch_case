package Switch_Case;
public class Switch_demo
{
	public static void main(String[] args)
		{
			int day = 2;
			String dayType;
			String dayString;

			switch (day) 
			{

			case 1:
				dayString = "Monday";dayType = "Weekday";
				break;

			
			case 2:
				dayString = "Tuesday";dayType = "Weekday";
				break;

			case 3:
				dayString = "Wednesday";dayType = "Weekday";
				break;
			case 4:
				dayString = "Thursday";dayType = "Weekday";
				break;
			case 5:
				dayString = "Friday";dayType = "Weekday";
				break;
			case 6:
				dayString = "Saturday";dayType = "Weekend";
				break;
			case 7:
				dayString = "Sunday";dayType = "Weekend";
				break;
			default:
				dayString = "Invalid day";
			}	
			System.out.println(dayString + " is a "+dayType);
		}
	
}
