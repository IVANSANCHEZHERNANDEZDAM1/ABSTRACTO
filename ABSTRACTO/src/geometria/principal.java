package geometria;

import javax.swing.JOptionPane;

public class principal {

	public static void main(String[] args) {
double base=Double.parseDouble(JOptionPane.showInputDialog("Introduce la base: "));
double altura=Double.parseDouble(JOptionPane.showInputDialog("Introduce la altura: "));

		rectangulo rectangulito = new rectangulo(base,altura);
		double radio=Double.parseDouble(JOptionPane.showInputDialog("Introduce el radio: "));
double radioalcuadrado=radio*radio;
		circulo circulito = new circulo(radio,radioalcuadrado);
		
		rectangulito.calculararea();
		circulito.calculararea();
	}

}
