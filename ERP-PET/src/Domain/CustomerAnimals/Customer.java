package Domain.CustomerAnimals;

import java.util.ArrayList;
import java.util.List;

public class Customer {
	private String name;
	private String email;
	private String mobileNumber;
	private String address;
	private List<Animal> animals = new ArrayList<Animal>();
	private List<Invoice> historicoVendas = new ArrayList<Invoice>();
	//Constructor
	public Customer() {
		
	}
	
	//Functions
	public void addAnimal(Animal animal) {
		animals.add(animal);
	}
	
	//Getters and Setters
	
	
	public String getName() {
		return name;
	}
	public List<Animal> getAnimals() {
		return animals;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
