package geometria;

public class circulo extends figurageometrica{
double PI=Math.PI;
double radio;
double radioalcuadrado=radio*radio;
public  circulo(double radio,double radioalcuadrado) {
this.radio = radio;
this.radioalcuadrado=radioalcuadrado;
}
@Override
public void calculararea() {
	System.out.println("El area del circulo es igual a PI * radioalcuadrado que es igual a: "+PI+"*"+radioalcuadrado+"="+PI*radioalcuadrado);
}
}
