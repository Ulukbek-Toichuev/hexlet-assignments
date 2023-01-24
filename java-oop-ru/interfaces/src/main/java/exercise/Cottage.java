package exercise;

// BEGIN
public class Cottage implements Home{

	private double area;
	private int floorCount;

	public Cottage(double area, int floorCount){
		this.area = area;
		this.floorCount = floorCount;
	}

	@Override
	public double getArea(){
		return area;
	}

	@Override
	public int compareTo(Home home){
		if (this.getArea() > home.getArea()){
			return 1;
		}else if(this.getArea() < home.getArea()){
			return -1;
		}else{
			return 0;
		}
	}

	@Override
	public String toString(){
		String res = floorCount + " этажный коттедж площадью "+ this.getArea() +" метров";
		return res;
	}

}
// END
