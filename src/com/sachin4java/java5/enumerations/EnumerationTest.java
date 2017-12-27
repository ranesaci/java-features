package com.sachin4java.java5.enumerations;

public class EnumerationTest {

	public static void main(String[] args) {
		
		testEnum(MyWeekDaysEnum.MONDAY);
	}
	//Here we can not pass other value than enum values. So we can avoid garbage params
	private static void testEnum(MyWeekDaysEnum weekDaysEnum) {
		
		switch (weekDaysEnum) {
		case MONDAY:{
			System.out.println("It is "+weekDaysEnum.toString());
			break;
		}
		case TUESDAY:{
			System.out.println("It is "+weekDaysEnum.toString());
			break;
		}
		case WEDNESDAY:{
			System.out.println("It is "+weekDaysEnum.toString());
			break;
		}
		case THURSADAY:{
			System.out.println("It is "+weekDaysEnum.toString());
			break;
		}
		case FRIDAY:{
			System.out.println("It is "+weekDaysEnum.toString());
			break;
		}
		case SATURDAY:{
			System.out.println("It is "+weekDaysEnum.toString());
			break;
		}
		case SUNDAY:{
			System.out.println("It is "+weekDaysEnum.toString());
			break;
		}

		default:
			break;
		}
		
	}

}
