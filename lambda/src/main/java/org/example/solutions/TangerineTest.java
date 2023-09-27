package org.example.solutions;

import java.util.ArrayList;
import java.util.List;

public class TangerineTest {
    public static void main(String[] args) {
        List<Tangerine> inventory = new ArrayList<>();
        inventory.add(new Tangerine(300, Colour.ORANGE));
        inventory.add(new Tangerine(120, Colour.RED));
        inventory.add(new Tangerine(140, Colour.ORANGE));
        inventory.add(new Tangerine(170, Colour.RED));
        inventory.add(new Tangerine(200, Colour.ORANGE));
        inventory.add(Tangerine.builder().weight(200).colour(Colour.RED).build());
        inventory.add(Tangerine.builder().weight(300).colour(Colour.ORANGE).build());


        prettyPrint(inventory, tangerine -> "A tangerine of " + tangerine.getWeight() + "g");

        TangerineFormatter fancyFormatter = tangerine -> {
            String characteristic = tangerine.getWeight() > 150 ? "Heavy" : "Light";
            return "A " + characteristic + " " + tangerine.getColour() + " " + tangerine.getWeight() + "g tangerine";
        };

        prettyPrint(inventory, fancyFormatter);
    }

    private static void prettyPrint(List<Tangerine> inventory, TangerineFormatter tangerineFormatter) {
        for (Tangerine tangerine : inventory) {
            String output = tangerineFormatter.accept(tangerine);
            System.out.println(output);
        }
    }
}
