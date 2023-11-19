package exercice3;

public class Complexe {
	
	private double re , img ;

	public Complexe(double re, double img) {
		this.re = re;
		this.img = img;
	}

	public Complexe(double re) {
		this.re = re;
		this.img = 0 ; 
	} 
	
	
	
	public double getRe() {
		return re;
	}

	public void setRe(double re) {
		this.re = re;
	}

	public double getImg() {
		return img;
	}

	public void setImg(double img) {
		this.img = img;
	}

	public void afficher() {
		System.out.println(re+"+i"+img);
	}
	
	public Complexe plus(Complexe z) {
		
		Complexe zr = new Complexe (this.re+z.re , this.img+z.img) ; 
		return zr ;
		
	}

}
