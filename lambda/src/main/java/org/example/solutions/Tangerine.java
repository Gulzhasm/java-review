package org.example.solutions;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Builder // Builder generates an @AllArgsConstructor unless there is another @XConstructor
//that is why we do not use @Builder so much instead we use @Data in the real project
public class Tangerine {
    private int weight;
    private Colour colour;
}
