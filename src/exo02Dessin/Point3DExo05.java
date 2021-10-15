package exo02Dessin;

public class Point3DExo05 extends Point2DExo05{
	
	int z;

	public Point3DExo05() {
		super();
	}
	

	public Point3DExo05(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}
	
	public void translater(int dX, int dY,int dZ) {
		super.setX(super.getX()+dX);
		super.setY(super.getY()+dY);
		this.setZ(this.getZ()+dZ);
	}
	
	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}

	@Override
	public String toString() {
		return "Point2D [x=" + super.x + ", y=" + super.y +", z=" + this.getZ() + "]";
		
	}
	
	
	
	
	
}
