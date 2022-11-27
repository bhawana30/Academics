package coordinates;

class Cartesian {
	void topolar(int x,int y){
		double res = Math.sqrt((x*x)+(y*y));
		double angle = Math.atan(y/x);
		System.out.println("polar form(r,theta) will be: ("+res+" , "+angle+")");
		
	}
}
