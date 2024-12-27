package vezbanjenizovi;

public class ParniIndexi {

	public static void main(String[] args) {
		int []niz = {2,5,88,76,9,12};
		System.out.println("Clanovi niza na  parnom indeksu");
		parniIndexi(niz);
		

	}
	public static void parniIndexi(int []niz) {
		for (int i = 0; i < niz.length; i++) {
			if(i%2==0){
				System.out.println(niz[i]+" ");
			}
			
		}
	}

}
