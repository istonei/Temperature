
import java.util.Scanner;


public class Temperatures {

	//array for months and temps
	static int[][] temperature = new int[12][2];

	
	public static void main(String[] args) {
		
		//display average, high low, and dates of temperatures
		inputTempForYear();
		System.out.println("Average high temperature of year: " + calculateAverageHigh(temperature));
		System.out.println("Average low temperature of year: " + calculateAverageLow(temperature));
		System.out.println("Highest temperate of year was on: " + monthName(findHighestTemp(temperature)));
		System.out.println("Lowest temperature of year was on: " + monthName(findLowestTemp(temperature)));
		

	}
	public static void inputTempForMonth(int month, int[][] i)
	{
		//get highest temperature for month
		System.out.println("Enter highest temperature for " + monthName(month));
		Scanner keyboard = new Scanner(System.in);
		int hightemp = keyboard.nextInt();
		i[month][0] = hightemp;
		
		//get the lowest temperature for month
		System.out.println("Enter the low temperature for " + monthName(month));
		int lowtemp = keyboard.nextInt();
		i[month][1] = lowtemp;
	}
	public static int[][] inputTempForYear()
	{
		//input temp for year
		for(int j=0; j < temperature.length; j++)
		inputTempForMonth(j, temperature);
		
		return temperature;
	}
	
	public static int calculateAverageHigh(int[][] i)
	{
		int total = 0;
		int average = 0;
		for (int j = 0; j < i.length; j++)
			total += i[j][0];
		average = total/i.length;
		return average;
	}
	public static int calculateAverageLow(int[][] i)
	{
		//get average of lowest temps
		int total = 0;
		int average = 0;
		for (int j=0; j < i.length; j++)
			total += i[j][1];
			average = total/i.length;
			return average;
	}
	public static int findHighestTemp(int[][] i)
	{
		//get highest temp
		int temp = i[0][0];
		int high = 0;
		for(int j = 1; j < i.length; j++)
		{
			if (i[j][0] < temp)
			{
				temp = i[j][0];
				high = j + 1;
			}
		}
		return high;
	}
	public static int findLowestTemp(int[][] i)
	{
		//find the lowest temp
		int temp = i[0][1];
		int low = 0;
		for (int j = 1; j < i.length; j++)
		{
			if (i[j][1] < temp)
			{
				temp = i[j][1];
				low = j + 1;
			}
		}
		return low;
	}
	public static String monthName(int i)
	{
		//display months
		String monthName1;
		
		switch(i)
		{
		case 0:
			monthName1 = "January";
			break;
		case 1:
			monthName1 = "February";
			break;
		case 2:
			monthName1 = "March";
			break;
		case 3:
			monthName1 = "April";
			break;
		case 4:
			monthName1 = "May";
			break;
		case 5:
			monthName1 = "June";
			break;
		case 6:
			monthName1 = "July";
			break;
		case 7:
			monthName1 = "August";
			break;
		case 8:
			monthName1 = "September";
			break;
		case 9:
			monthName1 = "October";
			break;
		case 10:
			monthName1 = "November";
			break;
		case 11:
			monthName1 = "December";
			break;	
			default:
				monthName1 ="error";
				break;
			
		}
		return monthName1;
	}

}
