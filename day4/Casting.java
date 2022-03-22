package day4;

public class Casting {

	String name;
	long number;

	public Casting(String name, long number) {
		this.name = name;
		this.number = number;

	}

	public void call() {
		System.out.println(name + "is calling");
	}

	public void chat() {
		System.out.println(name + "is chatting");
	}

	public void share() {
		System.out.println(name + "is sharing");
	}

}
