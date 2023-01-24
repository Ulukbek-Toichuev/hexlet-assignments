package exercise;

import java.util.List;
import java.util.stream.Collectors;

// BEGIN
public class App{
	public static List<String> buildApartmentsList(List<Home> homes, int n) {
        homes.sort((a, b) -> a.getArea() - b.getArea());
        List<String> apartmentsList = new ArrayList<>();
        for (int i = 0; i < n && i < homes.size(); i++) {
            apartmentsList.add(homes.get(i).toString());
        }
        return apartmentsList;
    }
}
// END
