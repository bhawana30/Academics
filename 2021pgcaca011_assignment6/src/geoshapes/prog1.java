package geoshapes;

import geoshapes.Circle  ;
import geoshapes.Rectangle;
import geoshapes.Triangle;
import geoshapes.Sphere;
public class prog1 {
 public static void main(String [] args) {
	 Circle c = new Circle();
	 Rectangle r = new Rectangle();
	 Triangle t = new Triangle();
	 Sphere s = new Sphere();
	 c.Area(4);
	 c.perimetre(5);
	 r.area(3, 4);
	 r.perimetre(6, 7);
	 t.area(5, 6, 7);
	 t.perimetre(7, 8, 9);
	 s.Area(8);
 }
}
