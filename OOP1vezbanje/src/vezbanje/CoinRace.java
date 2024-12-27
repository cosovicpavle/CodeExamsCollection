package vezbanje;

public class CoinRace {

	public static void main(String[] args) {
		final int GOAL=3;
		int count1 = 0, count2=0;
		
		Coin coin1 =  new Coin();
		Coin coin2 =  new Coin();
		
		while(count1<GOAL && count2<GOAL) {
			
			coin1.flip();
			coin2.flip();
			
			System.out.print("Coin1: "+coin1+" | ");
			System.out.println("Coin2: "+coin2);
			
			if(coin1.itsHeads()) {
				count1++;
				
					
					
				
			}else {
				count1=0;
			}
			
			if(coin2.itsHeads()) {
				count2++;
			}else {
				count2=0;
			}
			
		}
		
		if(count1<GOAL) {
			System.out.println("The Winner is Coin2!");
			
		}else {
			if(count2<GOAL) {
				System.out.println("The Winner is Coin1!");
			}else {
				System.out.println("Its Tie!");
			}
		}
		

	}

}
