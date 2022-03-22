package assignment2;

public class GamingLaptop extends Laptop {
	String g;
	int mem;

	public GamingLaptop(int p, int r, int s, String OS, String specialfeature, String graphics, int graphicsmem) {
		super(p, r, s, OS, specialfeature);
		g = graphics;
		mem = graphicsmem;

	}

	public static void main(String[] args) {

		GamingLaptop gamingLaptop = new GamingLaptop(40000, 8, 1024, "windows", "portable", "amd", 4);
		System.out.println(gamingLaptop.price);
		System.out.println(gamingLaptop.ram);
		System.out.println(gamingLaptop.os);
		System.out.println(gamingLaptop.sp);
		System.out.println(gamingLaptop.storage);
		System.out.println(gamingLaptop.g);
		System.out.println(gamingLaptop.mem);

	}

}
