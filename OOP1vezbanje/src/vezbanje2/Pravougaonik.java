package vezbanje2;

public class Pravougaonik {
	
	private int a;
	private int b;
	
	Pravougaonik(int a,int b){
		this.a=a;
		this.b=b;
		
	}
	
	public int povrsinaP() {
		return this.a*this.b;
		
	}
	public int obimP() {
		return 2*this.a+2*this.b;
	}
	
	@Override
	public String toString() {
		 return "Za zadate stranice a= "+a+" i b= "+b+ " Povrsina je: "+povrsinaP()+", a Obim je: "+obimP();
	}

}
