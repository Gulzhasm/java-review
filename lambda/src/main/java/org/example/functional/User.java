package org.example.functional;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@Builder
@ToString
public class User {

    private String firstName;
    private String lastName;
    private int age;
}
