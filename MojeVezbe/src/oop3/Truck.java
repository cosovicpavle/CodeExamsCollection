package oop3;

public class Truck extends Car {
	
	
	private int weight;
	
	public Truck(int speed, double regularPrice, String color,int weight) {
		super(speed, regularPrice, color);
		this.weight=weight;
		
	}



	
	
	
	
	@Override
	public double getSalePrice() {
		if(this.weight>2000)
		return super.getSalePrice()-(this.getRegularPrice()/(100/10));
		else
			return super.getSalePrice()-(this.getRegularPrice()/(100/20));
			
	}

}
