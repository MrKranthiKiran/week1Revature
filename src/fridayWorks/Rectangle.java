package fridayWorks;

public class Rectangle extends Quadrilaterals{
	

	

	public void calculateRec(int h, int w) {
		qType = "rectangle";
		area = h*w;
		super.result(qType, area);
	}
	

}
