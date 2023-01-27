package exercise;

import lombok.*;

// BEGIN
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@EqualsAndHashCode(exclude = "id")
// END
class User {
    int id;
    String firstName;
    String lastName;
    int age;
}
