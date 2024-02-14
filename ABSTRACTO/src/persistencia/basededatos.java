package persistencia;

public class basededatos extends persistencias{
	@Override
	public void guardardatos() {
		System.out.println("La base de datos se guarda en MYSQL");
	}
	@Override
	public void cargardatos() {
		System.out.println("La base de datos  esta llena");
	}
}


