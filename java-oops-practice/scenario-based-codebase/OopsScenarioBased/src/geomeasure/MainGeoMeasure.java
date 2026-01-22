package geomeasure;

import java.util.Scanner;

public class MainGeoMeasure {
	public static void main(String[] args) {
		GeoSystem cus1 = new GeoSystem(1,8,7,8);
		GeoSystem cus2 = new GeoSystem(1,4,7,8);
		cus1.calculation();
		cus2.calculation();
		
		if(cus1.ans==cus2.ans) {
			System.out.println("Both are Equal");
		}else if(cus1.ans>cus2.ans) {
			System.out.println("Cus1 Length is large "+cus1.ans);
		}else {
			System.out.println("Cus2 length is large "+cus2.ans);
		}
	}
}