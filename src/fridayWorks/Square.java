package fridayWorks;

public class Square extends Quadrilaterals {
	
	
	public void calculateSquare(int side) {
		qType = "square";
		area = side*side;
		super.result(qType, area);
	}

}
