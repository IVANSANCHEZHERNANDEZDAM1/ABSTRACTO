package geometria;

public class rectangulo extends figurageometrica{
double base;
double altura;
public  rectangulo(double base,double altura) {
this.base = base;
this.altura = altura;

}
@Override
public void calculararea() {
	System.out.println("El area del rectangulo es igual a base * altura que es igual a: "+base+"*"+altura+"="+base*altura);
}
}
