package exo02Dessin;

public class Point2DExo04 {
	
	int x;
	int y;
	static int compteur;
	
	
	
	public Point2DExo04() {
		this.x = 1;
		this.y = 1;
		setCompteur(getCompteur()+1);
		System.out.println("Compteur : "+getCompteur());
	}

	public Point2DExo04(int x, int y) {
 		this.x = x;
		this.y = y;
		setCompteur(getCompteur()+1);
		System.out.println("Compteur : "+getCompteur());
	}
	
	public void translater(int dX, int dY) {
		this.setX(this.getX()+dX);
		this.setY(this.getY()+dY);
	}
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public static int getCompteur() {
		return compteur;
	}

	public static void setCompteur(int compteur) {
		Point2DExo04.compteur = compteur;
	}

	@Override
	public String toString() {
		return "Point2D [x=" + x + ", y=" + y + "]";
	}
	
	

}
