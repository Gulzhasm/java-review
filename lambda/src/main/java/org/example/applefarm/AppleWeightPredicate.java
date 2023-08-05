package lambda.src.main.java.org.example.applefarm;

public class AppleWeightPredicate implements ApplePredicate {

    @Override
    public boolean test(Apple apple) {
        return apple.getWeight() > 200;
    }
}
