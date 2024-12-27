package oop1;

public class Krug {
	
	public double r;
	
	public Krug(double r) {
		this.r=r;
	}
	
	
	
	public double obimK() {
		return 2*r*Math.PI;
	}
	
	public double povrsinaK() {
		return Math.pow(r, 2)*Math.PI;
	}
	@Override
	public String toString() {
		return "Za zadati poluprecnik r= "+this.r+" P= "+povrsinaK()+" O= "+obimK();
		
	}
	
		
	
	
	
	
	
	
	
	
	

}
