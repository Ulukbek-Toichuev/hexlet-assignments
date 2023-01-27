package exercise;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

// BEGIN
public class Validator{
    public static List<String> validate(Address address){

        String country = null;
        String city = null;
        String street = null;
        String houseNumber = null;
        List<String> res = new ArrayList<>();

        try {

            Field fieldCountry = address.getClass().getDeclaredField("country");
            fieldCountry.setAccessible(true);
            country = (String) fieldCountry.get(address);
            if (country == null){
                res.add("country");
            }

            Field fieldCity = address.getClass().getDeclaredField("city");
            fieldCity.setAccessible(true);
            city = (String) fieldCity.get(address);
            if (city == null){
                res.add("city");
            }


            Field fieldStreet = address.getClass().getDeclaredField("street");
            fieldStreet.setAccessible(true);
            street = (String) fieldStreet.get(address);
            if (street == null){
                res.add("street");
            }

            Field fieldHouseNumber = address.getClass().getDeclaredField("houseNumber");
            fieldHouseNumber.setAccessible(true);
            houseNumber = (String) fieldHouseNumber.get(address);
            if (houseNumber == null){
                res.add("houseNumber");
            }

        } catch (NoSuchFieldException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }


        return res;
    }
}
// END
