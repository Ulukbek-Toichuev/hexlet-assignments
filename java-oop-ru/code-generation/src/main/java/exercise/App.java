package exercise;

import com.fasterxml.jackson.core.JsonProcessingException;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;

// BEGIN
public class App {
    public static void save(Path path, Car car) throws Exception {
        String jsonString = car.serialize();
        Files.write(path, jsonString.getBytes());
    }

    public static Car extract(Path path) throws Exception {
        byte[] bytes = Files.readAllBytes(path);
        String jsonString = new String(bytes);
        return Car.unserialize(jsonString);
    }


}
// END
