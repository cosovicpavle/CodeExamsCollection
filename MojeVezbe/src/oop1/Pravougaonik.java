package oop1;

public class Pravougaonik {
	
	public double a;
	public double b;
	
	
	public Pravougaonik(double a, double b) {
		this.a=a;
		this.b=b;
		
	}
	
	
	
	public double obimP(){
		return 2*(a+b);
	}
	
	public double povrsinaP() {
		return a*b;
	}
	
	@Override
	public String toString() {
		return "Za zadate stranice a= "+this.a+" i b= "+this.b+" P= "+povrsinaP()+" O= "+obimP();
	}

}
