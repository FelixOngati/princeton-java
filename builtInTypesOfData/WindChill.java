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
		
		//windchill calculation
		double w = A + (B*t) + (((C*t) - 35.75) * Math.pow(v,E));
		System.out.println(w);
		
		
		
	}
}
