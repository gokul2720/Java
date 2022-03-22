package day4;

public class Group {

	public static void main(String[] args) {
		
		Casting casting= new Admin("naveen",9442967761l);
		casting.call();
		casting.chat();
		casting.share();
		
		Admin admin= (Admin) casting;
		
		admin.call();
		admin.chat();
		admin.share();
		admin.addition("raaju beedey");
		admin.removal("avan raththam soodey");
		
		

	}

}
