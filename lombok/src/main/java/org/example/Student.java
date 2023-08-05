package org.example;

import lombok.*;

//@NoArgsConstructor
//@RequiredArgsConstructor
//@Getter
//@Setter
//@ToString
//@EqualsAndHashCode
@AllArgsConstructor
@Data
public class Student {

    private String firstName;
    private String lastName;
    private String username;
    private String email;
    private String password;
    private String confirmPassword;
    private int age;
}
