package main.classes;

public class Car {
	private String color;
	private String plate;
	private String model;
	private int value;

	public Car(String color, String plate, String model, int value) {
		this.color = color;
		this.plate = plate;
		this.model = model;
		this.value = value;
	}
	
	public void setColor(String color) {
		this.color = color;
	}

	public String getColor() {
		return this.color;
	}

	public void setPlate(String plate) {
		this.plate = plate;
	}

	public String getPlate() {
		return this.plate;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getModel() {
		return this.model;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public int getValue() {
		return this.value;
	}
}
