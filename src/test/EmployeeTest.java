package main.test;
import main.classes.*;
import main.interfaces.*;
import main.enums.*;
import main.relatory.*;

public class EmployeeTest {

	/**
	 * Test this file
	 */

	public static void main(String[] args) {
		Car car = new Car("Black", "000-000", "Ford", 35000);
		Car carTwo = new Car("White", "111-111", "Nissan", 10000);

		Client c = new Client(
				"Fernando", "+0 00 00000-0000", "E Corp", "Brazil",
				20, 50000, 00001, TypesOfJobs.TYPE_JOB_TWO);
		
		Vendor v = new Vendor(
				"Augusto", "1 11 11111-1111", "F Corp",
				16, 10000, 20000, TypesOfJobs.TYPE_JOB_FOUR, "Brazil",
				"England", "USA", "Portugual");

		Relatory r = new Relatory();
		
		v.setCar(car);
		c.setCar(carTwo);

		// print relatory
		
		r.print(v);
	}
}
