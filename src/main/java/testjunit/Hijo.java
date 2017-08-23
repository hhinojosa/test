package testjunit;

public class Hijo extends Padre{
	double edad;
	public double getAhorrosDespuesDePadre(){
		return getAhorros()+10;
	}
}
