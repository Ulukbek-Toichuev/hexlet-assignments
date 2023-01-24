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
        midPoint.setX((beginPoint.getX() + endPoint.getX())/2);
        midPoint.setY((beginPoint.getY() + endPoint.getY())/2);
        
        return midPoint;
    }

    public Point getBeginPoint(){
        return beginPoint;
    }

    public Point getEndPoint(){
        return endPoint;
    }
}
// END
