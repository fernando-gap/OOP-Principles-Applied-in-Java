package main.classes;
import main.enums.*;
import main.interfaces.*;

public class Vendor extends Employee implements Calculatetable {
	private int sent;
	private int stock;
	private String[] locations;
	private TypesOfJobs types;

	public Vendor(String name, String phone, String enterprise, int age,
			int sent, int stock, TypesOfJobs types, String... locations) {

		super(name, phone, enterprise, age);
		this.sent = sent;
		this.stock = stock;
		this.types = types;
		this.locations = locations;
	}

	public double calcGain() {
		return (sent/stock) * 0.1;
	}

	public void setSent(int sent) {
		this.sent = sent;
	}

	public int getSent() {
		return this.sent;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public int getStock() {
		return this.stock;
	}

	public void setLocations(String[] locations) {
		this.locations = locations;
	}

	public String[] getLocations() {
		return this.locations;
	}

	public TypesOfJobs getTypes() {
		return this.types;
	}
}
