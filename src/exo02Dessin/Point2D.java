package exo02Dessin;

public class Point2D {
	
	int x;
	int y;
	
	public Point2D() {}

	public Point2D(int x, int y) {
		super();
		this.x = x;
		this.y = y;
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

	@Override
	public String toString() {
		return "Point2D [x=" + x + ", y=" + y + "]";
	}
	
	
	
	

}
