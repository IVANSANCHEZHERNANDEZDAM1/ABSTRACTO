package persistencia;

public class principal {

	public static void main(String[] args) {

		archivo tx = new archivo();
		basededatos sql =new basededatos();
		tx.guardardatos();
		tx.cargardatos();
		sql.guardardatos();
		sql.cargardatos();
		
	}

}
