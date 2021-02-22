package main.relatory;
import main.classes.*;

public class Relatory {
	public void print(Employee employee) {

		System.out.println("====================================");
		System.out.println("Name: "+ employee.getName());
		System.out.println("Age: "+ employee.getAge());
		System.out.println("Phone: "+ employee.getPhone());
		System.out.println("Enterprise: "+ employee.getEnterprise());
		System.out.println("\n----------------Car-----------------");
		System.out.println("Model: "+ employee.getCar().getModel());
		System.out.println("Plate: "+ employee.getCar().getPlate());
		System.out.println("Color: "+ employee.getCar().getColor());
		System.out.println("Value: "+ employee.getCar().getValue());
		System.out.println("----------------Car-----------------\n");

		if (employee instanceof Vendor) {

			System.out.println("You\'re a vendor!\n");
			System.out.println("Sent: "+ ((Vendor) employee).getSent());
			System.out.println("Stock "+ ((Vendor) employee).getStock());
			System.out.println("Type of job: "+ ((Vendor) employee).getTypes());

			System.out.println("\nLocations:");

			for (int i = 0; i < ((Vendor) employee).getLocations().length; i++) {
				System.out.println("  *  "+ ((Vendor) employee).getLocations()[i]);
			}

			System.out.println();
		}

		if (employee instanceof Client) {

			System.out.println("You\'re a client!\n");
			System.out.println("Country: "+ ((Client) employee).getCountry());
			System.out.println("Id: "+ ((Client) employee).getId());
			System.out.println("Type of job: "+((Client) employee).getTypes());
			System.out.println("Requests: "+ ((Client) employee).getRequests());
		}
		System.out.println("====================================");
	}
}

