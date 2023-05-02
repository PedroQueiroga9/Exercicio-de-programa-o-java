
public class Retangulo {
	public double width;
	public double height;
	
	
	public double area() {
		double area = this.width * this.height;
		return area ;
		}
	
	
	public double perimetro() {
		double p = 2 * (this.width * this.height);
		return p;
	}
	
	public double diagonal() {
		double d = Math.sqrt((this.width * this.width) +
				                          (this.height * this.height));
		return d;
	}
}
