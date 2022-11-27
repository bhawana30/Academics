package coordinates;

class Polar {
	void tocartesian(double r,double angle) {
		double x = r*Math.cos(angle);
		double y = r*Math.sin(angle);
		
		System.out.println("Cartesian form(x,y) will be: ("+x+" , "+y+")");
	}
}
