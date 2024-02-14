package persistencia;

public class archivo extends persistencias{

	@Override
	public void guardardatos() {
		System.out.println("Los archivos se guardan en txt");
	}
	@Override
	public void cargardatos() {
		System.out.println("El archivo esta vacio");
	}
}
