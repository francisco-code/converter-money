package util;

public class CurrencyConverter {
	
	public static final double IOF = 1.06;
	
	public static double money(double valueReal, double quantity) {
		return valueReal * quantity * IOF;
	}
}
