package exercise;

// BEGIN
public class Flat implements Home{
	
	private double area;
	private double balconyArea;
	private int floor;

	public Flat(double area, doble balconyArea, double floor){
		this.area = area;
		this.balconyArea = balconyArea;
		this.floor = floor;
	}

	@Override
	public double getArea(){
		return area + balconyArea;
	}

	public String toString(){
		return "Квартира площадью "+this.getArea()+" метров на "+floor+" этаже";
	}
	
	public int compareTo(Flat flat){
		if (this.getArea() > flat.getArea()){
			return 1;
		}else if(this.getArea() < flat.getArea()){
			return -1;
		}else{
			return 0;
		}
	}
}
// END
