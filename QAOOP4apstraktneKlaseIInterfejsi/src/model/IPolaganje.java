package model;

public interface IPolaganje {
	
	void polaganje();
	default void pozrav() {
		System.out.println("Srecno");
	}

}
