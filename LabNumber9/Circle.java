package LabNumber9;

import java.text.DecimalFormat;
import java.lang.Math;

public class Circle {

	static int counter = 1;

	public Circle(double radius) {

	}

	public static double getCircumference(double radius) {
		double circumference = 2 * Math.PI * radius;
		return circumference;

	}

	public static String getFormattedCircumference(double radius) {
		double circumference = getCircumference(radius);
		String formattedCircumference = formatNumber(circumference);
		return formattedCircumference;

	}

	public static double getArea(double radius) {
		double area = Math.PI * (radius * radius);
		return area;

	}

	public static String getFormattedArea(double radius) {
		double area = getArea(radius);
		String formattedArea = formatNumber(area);
		return formattedArea;

	}

	private static String formatNumber(double numberToFormat) {
		DecimalFormat decForm = new DecimalFormat("#.00");
		String formattedNumber = decForm.format(numberToFormat);
		return formattedNumber;

	}

	public static int getObjectCount() {
		return counter++;

	}
}