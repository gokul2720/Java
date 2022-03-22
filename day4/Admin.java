package day4;

public class Admin extends Casting{
	
	String add;
	String remove;
	public Admin(String name, long number) {
		super(name,number);
	}
	
	public void addition(String username) {
		System.out.println(username +"is added");
	}
	
	public void removal(String username) {
		System.out.println(username +"is removed");
	}
	

}
