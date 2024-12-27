package vezbanje2;

public class Krug {
	
	private double r;
	
	
	Krug(double r){
		this.r=r;
	}
	
	public double povrsinaK() {
		return this.r*this.r*Math.PI;
	}
	
	public double obimK() {
		return 2*this.r*Math.PI;
	}
	
	@Override
	public String toString() {
		return "Za zadati poluprecnik: "+r+" Povrsina je: "+povrsinaK()+", a Obim je: "+obimK();
		
	}

}
