package test;

public class Kamion extends Vozilo implements TeretnoVozilo{

	public Kamion(int brojTockova,float duzina,int zapreminaMotora,int trenutnaBrzina,int maxBrzina) {
		this.setBrojTockova(brojTockova);
		this.setDuzina(duzina);
		this.setZapreminaMotora(zapreminaMotora);
		this.setTrenutnaBrzina(trenutnaBrzina);
		this.setMaxBrzina(maxBrzina);
	}

	@Override
	public void gas() {
		if(getZapreminaMotora()<6000) {
			setMaxBrzina(getTrenutnaBrzina()+5);
			setTrenutnaBrzina(getTrenutnaBrzina()+5);


			if(getTrenutnaBrzina()>getMaxBrzina()) {
				setTrenutnaBrzina(getTrenutnaBrzina()-5);
				



			}



		}else  {
			setMaxBrzina(getTrenutnaBrzina()+15);
			setTrenutnaBrzina(getTrenutnaBrzina()+15);
			if(getTrenutnaBrzina()>getMaxBrzina()) {
				setTrenutnaBrzina(getTrenutnaBrzina()-15);
				

			}
		}
	}


	@Override
	public void setBrojTockova(int brojTockova) {
		int min = 8,max=12;

		if(brojTockova<=min)
			super.setBrojTockova(min);
		if(brojTockova>=max)
			super.setBrojTockova(max);
		else
			super.setBrojTockova(min);











	}


	@Override
	public void setMaxBrzina(int maxBrzina) {

		if(maxBrzina>150) {
			this.setMaxBrzina(150);

		}else
			super.setMaxBrzina(maxBrzina);
	}

	@Override
	public void setDuzina(float duzina) {
		int min=4;
		int max=14;

		if(duzina<min)
			this.setDuzina(min);
		if(duzina>max)
			this.setDuzina(max);
		else
			super.setDuzina(duzina);
	}
	@Override
	public void setZapreminaMotora(int zapreminaMotora) {
		int min=4000;
		int max=8000;
		if(zapreminaMotora<min)
			this.setZapreminaMotora(min);
		if(zapreminaMotora>max)
			this.setZapreminaMotora(max);
		else
			super.setZapreminaMotora(zapreminaMotora);
	}

	@Override
	public float zapremina() {
		if(this.getDuzina()>10)
			return 4;
		else return 7;
	}

	@Override
	public String toString() {

		return "Kamion "+super.toString()+"\nZapremina: "+this.zapremina();
	}


}
