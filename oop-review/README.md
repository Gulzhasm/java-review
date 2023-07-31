
# OOP review java

1. Overloaded method’s access modifiers can be same as parent’s class or lower than parent;
2. Constructor is to create an object, java will create default constructor by default if you did not create one.
3. Object will be created when you use NEW keyword, and constructor will be triggered when you use new keyword;
4. Access modifiers uses to set the visibilities of class, methods, and variables → public, protected, default, private
5. Default Constructor is automatically provided for a class.
6. Overloaded method needs to have different parameters
7. Instance variables belong to object, static variables belong to class
8. Class can exist without an object
9. instance variables are object’s variables
10. constructor call has to be **the first statement** in the constructor’s body
11. this() is used for calling another constructor inside the constructor
12. private constructor → singleton design pattern → public getInstance() method
13. encapsulation is a data hiding
14. super() keyword is used for calling parent class’s constructor. By default, all classes can be inherited from Object class in java
15. static variables changes for the whole objects once changed the value
16. pre-increment ++i is equal to if i=28 increase by 1 immediately ⇒ 29
17. post-increment i++ (i=28) will be increased the next time, the first time the old value will be used
18. Execution order:
    1 - Static variables
    2 - Static blocks
    3 - Initializer blocks
    4 - Instance variables
    5 - Constructor
19. instance method can access to static method, static methods belong to class; in order to reach instance member, we need an object;
20. Instance variables can not be accessed with class name;
21. instance block will be executed only when the object is created!
22. Only one inheritance is allowed in java
