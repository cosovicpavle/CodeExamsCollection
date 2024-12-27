package oop3;

public class Mustang extends Car {
	
	
	private int lenghth;

	public Mustang(int speed, double regularPrice, String color, int lenghth) {
		super(speed, regularPrice, color);
		this.lenghth=lenghth;
		
	}
	
	@Override
	public double getSalePrice() {
		if(this.lenghth>6)
		return super.getSalePrice()-(this.getRegularPrice()/(100/5));
		else
			return super.getSalePrice()-(this.getRegularPrice()/(100/10));
	}

}
