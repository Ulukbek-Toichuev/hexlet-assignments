package exercise;

// BEGIN
public class App {
    public static void printSquare(Circle circle) throws NegativeRadiusException{
        try {
            double res =  circle.getSquare();
            int resInt = (int) Math.ceil(res);
            System.out.println(resInt + "\nВычисление окончено");
        }catch (NegativeRadiusException e){
            System.out.println(e.getMessage());
        }
    }
}
// END
