package Domain.CustomerAnimals;

public enum Species {
	DOG(1,"Cachorro"),
	CAT(2, "Gato");
	
	public final int ID;
	private final String RACA;
	private Species(int ID, String RACA) {
		this.ID = ID;
		this.RACA = RACA;
	}
	
	
}
