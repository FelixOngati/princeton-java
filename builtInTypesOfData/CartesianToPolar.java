

//take two real numbers x and y on the command 
//line and print the polar coordinates r and θ

public class CartesianToPolar{
	public static void main(String[] args){
		double x = Double.parseDouble(args[0]);
		double y = Double.parseDouble(args[1]);

		double r = Math.sqrt(x*x + y*y);
		double theta = Math.atan2(y,x);

		System.out.println("r = "+r);
		System.out.println("theta = "+theta);
	}
}

