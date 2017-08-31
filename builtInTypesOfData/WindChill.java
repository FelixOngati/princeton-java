//javac WindChill.java
//java WindChill t v
//t is temperature in Fahrenheit and v is wind speed
//w=35.74+0.6215t+(0.4275t-35.75)pow(v,0.16)
public class WindChill{
	public static void main(String[] args){
	
		//declare constants as per the windchill formula
		final double A = 35.74;
		final double B = 0.6215;
		final double C = 0.4275;
		final double D = 35.75;
		final double E = 0.16;

		//get arguments passed on the commandline
		double t = Double.parseDouble(args[0]);
		double v = Double.parseDouble(args [1]);
		
		//validation checks
		if(Math.abs(t) > 50){
			System.out.println("Absolute value of t should be less than 50!");
			System.exit(0);
		}
		if(v < 3 || v > 120){
			System.out.println("Value of v should be between 3 and 120, inclusive!");
			System.exit(0);
		}
		//windchill calculation
		double w = A + (B*t) + (((C*t) - 35.75) * Math.pow(v,E));
		System.out.println(w);
		
		
		
	}
}
