package exercise;

// BEGIN
public class Cottage implements Home{

	private double area;
	private int floorCount;

	public Cottage(double are, int floorCount){
		this.area = area;
		this.floorCount = floorCount;
	}

	@Override
	public double getArea(){
		return area;
	}

	public int compareTo(Cottage cottage){
		if (this.getArea() > cottage.getArea()){
			return 1;
		}else if(this.getArea() < cottage.getArea()){
			return -1;
		}else{
			return 0;
		}
	}

	public String toString(){
		return floorCount + " этажный коттедж площадью "+ area +" метров";
	}

}
// END
