package main.classes;
import main.enums.*;
import main.interfaces.*;

public class Client extends Employee implements Calculatetable {
	private String country;
	private int id;
	private int requests;
	private TypesOfJobs types;
	
	public Client(
			String name, String phone, String enterprise, String country, 
			int age, int requests, int id, TypesOfJobs types ) {

		super(name, phone, enterprise, age);
		this.country = country;
		this.requests = requests;
		this.id = id;
		this.types = types;
	}

	public double calcGain() {
		return (this.requests/2) * 0.1;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCountry() {
		return this.country;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return this.id;
	}

	public void setRequests(int requests) {
		this.requests = requests;
	}

	public int getRequests() {
		return this.requests;
	}

	public TypesOfJobs getTypes() {
		return this.types;
	}
}
