package TesteInterface;

public class MovableRectangle implements Movable  {
	private MovablePoint cantoSE;
	private MovablePoint cantoID;
	
	
	
	
	public MovableRectangle(int x , int y , int xSpeed ,int ySpeed) {
		this.cantoSE = new MovablePoint(x,y,xSpeed,ySpeed);
		this.cantoID = new MovablePoint(x,y,xSpeed,ySpeed);
	}
	public String toString() {
		return "canto superior esquedo"+this.cantoSE.toString()+
				"canto inferior direito"+this.cantoID.toString();
	}
	
	
	
	
	public void moveUp() {
		this.cantoSE.moveUp();
		
		
	}
	
	public void moveDown() {
		this.cantoID.moveDown();
		
	}
	
	public void moveLeft() {
		this.cantoSE.moveLeft();
		
	}
	
	public void moveRight() {
		this.cantoID.moveRight();
		
	}
	
	
	

}
