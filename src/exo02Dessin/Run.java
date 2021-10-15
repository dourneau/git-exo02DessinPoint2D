package exo02Dessin;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Point2D p1 = new Point2D(5,7);
		Point2D p2 = new Point2D(-5,7);
		
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

	}

}
