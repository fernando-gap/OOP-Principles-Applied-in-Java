package main.classes;

public abstract class Employee {
	private String name;
	private int age;
	private String phone;
	private String enterprise;
	private Car car;

	public Employee(String name, String phone, String enterprise, int age) {
		this.name = name;
		this.phone = phone;
		this.enterprise = enterprise;
		this.age = age;
	}

	public void setCar(Car car) {
		this.car = car;
	}
	
	public Car getCar() {
		return this.car;
	}
	
	public String getName() {
		return this.name;
	}

	public int getAge() {
		return this.age;
	}

	public String getPhone() {
		return this.phone;
	}

	public String getEnterprise() {
		return this.enterprise;
	}
}
