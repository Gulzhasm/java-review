# Stream API, lambda expressions

1. Functional Programming - Lambda will enable functional programming → more readable code
2. Strategy Design Pattern: ApplePredicate is behavior parameterization and strategy design pattern
3. Lambda are just functions. They do not belong to any class. These functions can assume as values. String name = “someName”; **public void sort(){ sout(”sorting”);**

abc = **public**  **void sort(){ sout(”sorting”); → void sort(){ sout(”sorting”)}; → void (){ sout(”sorting”)}; → (){ sout(”sorting”);} → () →sout(”sorting”);**

lambda expressions: abc = () → System.out.println(”some code”);

public void sort( () → System.out.println(”some code”);){action();}

1. Function that takes parameter:

weightApple = public boolean test(Apple apple){return apple.getWeight() > 200;}

**lambda:**

**weightApple = (Apple apple) →  apple.getWeight() > 200;**

int lengthCount = (s) → s.length;

myFunction = (int x, int y) →{ sout(”Result”; sout(x+y);}; - we need curly braces when method body has more than 1 line;

myLambda = () →42;


!!!! You can use lambda expression in only Functional Interface
2. Type Inference:

**interface StringLengthLambda{**

**int getLength(String s);**

**}**

**StringLengthLambda myLambda = (s) → s.length;**

when you do not have to specify the parameter type is called as **Inference**

if you have only one argument, you do not need the parentheses ()

java.utils.function -> you can always go back and revise 