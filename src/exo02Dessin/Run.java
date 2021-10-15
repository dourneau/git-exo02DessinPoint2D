package exo02Dessin;

public class Run {

	public static void main(String[] args) {
		
		

		Point2DExo03 p1 = new Point2DExo03(5,7);
		Point2DExo03 p2 = new Point2DExo03(-5,-2);
		
		System.out.println(p1);
		int dX = 5;
		int dY = 2;
		System.out.println("Translation de vecteur : ("+dX+','+dY+")");
		p1.translater(dX,dY);
		System.out.println(p1);
		
		System.out.println(p2);
		dX = -5;
		dY = -2;
		System.out.println("Translation de vecteur : ("+dX+','+dY+")");
		p2.translater(dX, dY);
		System.out.println(p2);
		
		
		
		
		/*
		Point2D p1 = new Point2D();
		Point2D p2 = new Point2D();
		
		p1.x=5;
		p1.y=7;
		System.out.println(p1);
		int dX = 5;
		int dY = 2;
		System.out.println("Translation de vecteur : ("+dX+','+dY+")");
		p1.translater(dX,dY);
		System.out.println(p1);
		
		p2.x=-5;
		p2.y=-8;
		System.out.println(p2);
		dX = -5;
		dY = -2;
		System.out.println("Translation de vecteur : ("+dX+','+dY+")");
		p2.translater(dX, dY);
		System.out.println(p2);
		*/
		
		
		
		
		
	}
		 
		
		
		
		
		
}
