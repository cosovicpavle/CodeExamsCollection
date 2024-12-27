package test;

public class Autobus extends Vozilo implements PutnickoVozilo {

	public Autobus(){

	}

	@Override
	public void gas() {

		if(getZapreminaMotora()<3000) {
			setMaxBrzina(getTrenutnaBrzina()+5);
			setTrenutnaBrzina(getTrenutnaBrzina()+5);


			if(getTrenutnaBrzina()>getMaxBrzina()) {
				setTrenutnaBrzina(getTrenutnaBrzina()-5);
				



			}



		}else  {
			setMaxBrzina(getTrenutnaBrzina()+10);
			setTrenutnaBrzina(getTrenutnaBrzina()+10);
			if(getTrenutnaBrzina()>getMaxBrzina()) {
				setTrenutnaBrzina(getTrenutnaBrzina()-10);
				

			}
		}






	}

	@Override
	public void setBrojTockova(int brojTockova) {
		if(brojTockova<=4 ) 
			super.setBrojTockova(4);
		if(brojTockova>=8 )
			super.setBrojTockova(8);
		if(brojTockova==5 || brojTockova==7 || brojTockova==6)
			super.setBrojTockova(6);

	}


	@Override
	public void setMaxBrzina(int maxBrzina) {
		if(maxBrzina<=200)
			super.setMaxBrzina(maxBrzina);
		else
			super.setMaxBrzina(200);
	}

	@Override
	public void setDuzina(float duzina) {

		int min=8;
		int max=15;
		if(duzina<min)
			this.setDuzina(min);
		if(duzina>max)
			this.setDuzina(max);
		else
			super.setDuzina(duzina);

	}

	@Override
	public void setZapreminaMotora(int zapreminaMotora) {
		int min=2000;
		int max=5000;
		if(zapreminaMotora<min)
			this.setZapreminaMotora(min);
		if(zapreminaMotora>max)
			this.setZapreminaMotora(max);
		else
			super.setZapreminaMotora(zapreminaMotora);

	}

	@Override
	public int brojSedista() {
		if(this.getDuzina()<10) {
			return 20;
		}else {
			return 40;
		}




	}

	@Override
	public String toString() {

		return "Autobus "+super.toString()+"\nBrojSedista: "+this.brojSedista();
	}




}
