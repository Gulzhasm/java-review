package org.example.functional;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class UserTest {
    public static void main(String[] args) {
        //create a list with users
        //print all users
        //print all users that last name starts with E

        List<User> userList = new ArrayList<>();

        userList.add(new User("Gul", "Mail", 33));
        userList.add(new User("Gul", "Eail", 33));
        userList.add(new User("Gul", "Wail", 33));
        userList.add(new User("Gul", "Nail", 33));

     //   userList.stream().filter(x -> x.getLastName().startsWith("E")).forEach(System.out::println);

        printLastName(userList, x->x.getLastName().startsWith("E"));
    }

    private static void printLastName(List<User> userList, Predicate<User> predicate){
        for (User user: userList ) {
            if(predicate.test(user)){
                System.out.println(user.toString());
            }

        }
    }
}
