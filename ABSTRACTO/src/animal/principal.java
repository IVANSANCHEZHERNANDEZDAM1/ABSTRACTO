package animal;

public class principal {

	public static void main(String[] args) {

		perro roco = new perro();
		gato masi = new gato();
		roco.hacersonido();
		roco.moverse();
		System.out.println("\n");
		System.out.println("\n");
		masi.hacersonido();
		masi.moverse();
	}

}
