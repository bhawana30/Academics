package geoshapes;

class Triangle {
	void area(int a,int b,int c) {
		int s = (a+b+c)/2;
		double x = Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.println("Area if Triangle is : "+x);
	}
	void perimetre(int a,int b,int c) {
		int x = a+b+c;
		System.out.println("Perimeter of rectangle is: "+x);
	}
}
