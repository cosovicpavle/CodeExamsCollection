package oop1;

public class Coin {
	
	private final int HEADS =0;
	private final int TAILS=1;
	public int face;
	
	
	public  Coin() {
		
		flip();
		
		
	}
	
	public void flip() {
		
		this.face=(int)(Math.random()*2);
		
	}
	
	public boolean itsHeads() {
		
		return face==HEADS;
		
		
	}
	
	public String toString() {
		String faceName;
		
		if(face==HEADS) {
			faceName="Heads";
		}else{
			faceName ="Tails";
		}
		
		return faceName;
		
	}

}
