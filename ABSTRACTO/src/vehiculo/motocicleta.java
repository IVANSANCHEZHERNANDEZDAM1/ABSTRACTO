package vehiculo;

public  class motocicleta extends vehiculo {
@Override
	public void acelerar() {
		System.out.println("La motito no aceler porque esta rota");
	}
@Override
public void frenar() {
	System.out.println("La moto frena demasiado");
}
}