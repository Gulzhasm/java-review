import java.util.HashSet;
import java.util.Set;

public class SetReview {
    public static void main(String[] args) {
        Set<Student> set = new HashSet<>();

        set.add(new Student(7, "Joe"));
        set.add(new Student(8, "John"));
        set.add(new Student(9, "Julie"));
        set.add(new Student(9, "Julie"));

        System.out.println(set);

        Set<Integer> numSet = new HashSet<>();
        numSet.add(1);
        numSet.add(2);
        System.out.println(numSet);
        System.out.println(numSet.add(2));

        //find the first repeating char in a string
        // String s = "Java Developer"
        //Output a

        System.out.println(firstRepeatingChar("Java Developer"));
    }

    public static Character firstRepeatingChar(String s){
        Set<Character> characterSet = new HashSet<>();
        for (Character c: s.toCharArray()){
            if(!characterSet.add(c)){
                return c;
            }
        }
        return null;
    }
}
