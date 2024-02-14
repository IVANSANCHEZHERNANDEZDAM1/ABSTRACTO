package vehiculo;

public class principal {

	public static void main(String[] args) {

		automovil coche = new automovil();
		motocicleta moto = new motocicleta();
		
		coche.acelerar();
		coche.frenar();
		System.out.println("\n");
		System.out.println("\n");
		moto.acelerar();
		moto.frenar();
	}

}
