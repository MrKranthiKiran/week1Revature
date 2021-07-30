package fridayWorks;

public class Quadrilaterals {

	protected double area;
	protected String qType;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rectangle ob = new Rectangle();
		ob.calculateRec(10, 20);
		
		Square sq = new Square();
		sq.calculateSquare(10);
		
		Trapezium tp = new Trapezium();
		tp.calculateTrep(10, 15, 5);
		

	}
	
	public void result(String quadrilateral, double area) {
		System.out.println( "Area of " +quadrilateral + " is " + area) ; 
	}

}
