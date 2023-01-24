package exercise;

// BEGIN
public class Segment{
	
	private Point beginPoint;
	private Point endPoint;
	private Point midPoint;

	public Segment(Point beginPoint, Point endPoint){
		this.beginPoint = beginPoint;
		this.endPoint = endPoint;
	}

	public Point getMidPoint(){
		midPoint.setX(((beginPoint.getBeginPoint + endPoint.getBeginPoint)/2));
		midPoint.setY(((beginPoint.getEndPoint + endPoint.getEndPoint)/2));
		return midPoint;
	}

	public int getBeginPoint(){
		return beginPoint;
	}

	public int getEndPoint(){
		return endPoint;
	}
}
// END
