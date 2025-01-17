package oop3;

public class Ford extends Car{
	
	private int year;
	private int manufacturerDiscount;

	public Ford(int speed, double regularPrice, String color, int year, int manufacturerDiscount) {
		super(speed, regularPrice, color);
		this.year=year;
		this.manufacturerDiscount=manufacturerDiscount;
	}
	
	@Override
	public double getSalePrice() {
		
		return super.getSalePrice()-(this.getRegularPrice()/(100/this.manufacturerDiscount));
	}

}
