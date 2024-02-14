package empleado;

public class completo extends empleado{
	double salariohora=10;
	double horas=9;
	double salariodia=salariohora*horas;
	double diasmes=30;
	double salariomes=salariodia*diasmes;
	public void calcularsalario() {
		System.out.println("El salario de un empleado a tiempo completo es igual a: "+salariomes+" EUROS");
	}

}
