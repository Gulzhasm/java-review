package org.example.review;

import lombok.*;

@Data
@AllArgsConstructor
@ToString
public class Car {

    private String make;
    private int topSpeed;
    private int year;


    // private static final int final_year;
//    static {
//        final_year = 2020;
//    }
  // private  final int final_year;
//   Car(int final_year){
//       this.final_year = final_year;
//   }

}
