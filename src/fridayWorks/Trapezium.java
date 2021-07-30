package fridayWorks;

public class Trapezium extends Quadrilaterals {
	
	public void calculateTrep(int a, int b, int h) {
		qType = "square";
		area = ((a+b)/2)*2;
		super.result(qType, area);
	}

}
