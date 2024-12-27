package programi;

import oop3.Car;
import oop3.Ford;
import oop3.Mustang;
import oop3.Truck;

public class CarShop {
	
	public Car[]cars  ;
	
	public CarShop(Car[]cars) {
		this.cars=cars;
		
	}
	

	public static void main(String[] args) {
		
		
		Truck truck = new Truck(120, 200000, "yellow", 3000);
		Ford ford1 = new Ford(180, 50000, "blue", 2021, 15);
		Ford ford2 = new Ford(180, 60000, "green", 2022, 13);
		Ford ford3 = new Ford(180, 70000, "red", 2023, 5);
		Mustang mustang = new Mustang(250, 150000, "orange", 5);
		
		Car[]cars= {truck,ford1,ford2,ford3,mustang};
		
		
		for (Car car:cars) {
			if(car instanceof Truck) 
				System.out.println("Truck sale price: "+car.getSalePrice());
			if(car instanceof Ford) 
				System.out.println("Ford sale price: "+car.getSalePrice());
			if(car instanceof Mustang)
				System.out.println("Mustang sale price:"+car.getSalePrice());
			
			
		}
		
		
	

	}

}
