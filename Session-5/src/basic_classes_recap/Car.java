package basic_classes_recap;

public class Car {
	private String color;
	private String brand;
	private String model;
	private double price;
	private int productionYear;
	private boolean isForSale;

	public Car(String color, String brand, String model, double price, int productionYear) {
		this.color = color;
		this.brand = brand;
		this.model = model;
		this.price = price;
		this.productionYear = productionYear;

		// by default, cand cream o masina noua ea va fi de vanzare (fiindca de aia o producem :) )
		isForSale = true;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getProductionYear() {
		return productionYear;
	}

	public boolean isForSale() {
		return isForSale;
	}

	public void setForSale(boolean isForSale) {
		this.isForSale = isForSale;
	}

	@Override
	public String toString() {
		return "Car [color=" + color + ", brand=" + brand + ", model=" + model + ", price=" + price
				+ ", productionYear=" + productionYear + ", isForSale=" + isForSale + "]";
	}

	public void sellCar() {
		if(isForSale) {
			System.out.println("Sold!");
			isForSale = false;
		}
		else {
			System.out.println("Not for sale");
		}
	}

}

