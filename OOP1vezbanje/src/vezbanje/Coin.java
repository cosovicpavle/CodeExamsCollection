package vezbanje;

public class Coin {
	
    private final int Heads=0;
    private final int Tails=1;
    
    private int face;
    
    Coin(){
    	flip();
    	
    }
    
    
    public void flip() {
    	this.face=(int)(Math.random()*2);    
    }
    
    public boolean itsHeads() {
    	return face==Heads;
    	
    }
    
    @Override
    public String toString() {
    	String faceName=null;
    	
    	if(face==Heads) {
    		faceName="Heads";
    	}else {
    		if(face==Tails) {
    			faceName="Tails";
    		}
    	}
    	return faceName;
    }
}
