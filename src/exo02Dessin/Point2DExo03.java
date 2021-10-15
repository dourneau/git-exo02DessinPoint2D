package exo02Dessin;

public class Point2DExo03 {
	
	int x;
	int y;
	
	public Point2DExo03() {
		this.x = 1;
		this.y = 1;
	}

	public Point2DExo03(int x, int y) {
 		this.x = x;
		this.y = y;
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

	@Override
	public String toString() {
		return "Point2D [x=" + x + ", y=" + y + "]";
	}
	
	
	
	

}
