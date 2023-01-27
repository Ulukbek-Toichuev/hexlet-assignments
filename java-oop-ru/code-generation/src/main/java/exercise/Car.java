package exercise;

import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.*;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

// BEGIN
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@EqualsAndHashCode(exclude = "id")
// END
class Car {
    int id;
    String brand;
    String model;
    String color;
    User owner;

    // BEGIN
    public String serialize() throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.writeValueAsString(this);
    }

    public static Car unserialize(String jsonRepresentation) throws IOException {

        ObjectMapper objectMapper = new ObjectMapper();

        return objectMapper.readValue(jsonRepresentation, Car.class);
    }
    // END
}
