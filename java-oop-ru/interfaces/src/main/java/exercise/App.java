package exercise;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

// BEGIN
public class App{
	public static List<String> buildApartmentsList(List<Home> homes, int n) {
        homes.sort(Comparator.comparing(Home::getArea));
        List<String> apartmentsList = new ArrayList<>();
        for (int i = 0; i < n && i < homes.size(); i++) {
            apartmentsList.add(homes.get(i).toString());
        }
        return apartmentsList;
    }
}
// END
