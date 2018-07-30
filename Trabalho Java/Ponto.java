public class Ponto{

protected double x,y,w,z;
  	
	public Ponto(){
  	setPonto(0,0,0,0);
  	}
	
	public Ponto(double a ,double b,double c,double d){
	setPonto(a,b,c,d);
	}
	
	public void setPonto(double a,double b,double c,double d){
	x=a;
	y=b;
	w=c;
	z=d;
	}
	
	public String emPalavras(){
	return"["+x+","+y+","+w+","+z+"]";
}
}