public class Circulo extends Ponto{
	protected double r;
	
	public Circulo(){
	setRaio(0);
	}

	public Circulo(double a,double b,double r){
	super(a,b,0,0);
	setRaio(r);
	}

	public void setRaio(double r){
	this.r=r;
	}

	public String emPalavras(){
	return super.emPalavras ()+ "."+r+"]";
	}
	
	
}

