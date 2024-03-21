import java.util.Scanner;

public class w7q2_Abstract {
    public static void main(String[] args) {
        Scanner sc  =  new Scanner(System.in);
        System.out.println("Enter your name");
        String nm = sc.nextLine();
       
        Athelete ath = new Athelete();
        ath.name(nm);
        ath.eat();
        ath.excercise();

        LazyPerson lp = new LazyPerson();
        lp.name(nm);
        lp.eat();
        lp.excercise();

        sc.close();
    }
}


//Abstract class
abstract class Person {

    //Abstract method
    abstract String name(String name);

    abstract void eat();
    abstract void excercise();
}


//creating a class extending Person
class Athelete extends Person{
    @Override
    String name(String name) {
        System.out.println("My name is "+name);
        return null;
    }

    @Override
    void eat() {
        System.out.println("I am Athelete. I eat Healthy foods like Egg, Banana etc");

    }

    @Override
    void excercise() {
        System.out.println("I do excercise daily");
    }
}


//creating another class extending person
class LazyPerson extends Person{

    @Override
    String name(String name) {
        System.out.println("My name is "+name);
        return null;
    }

    @Override
    void eat() {
        System.out.println("I am Lazy person. I eat junk foods");
    }


    @Override
    void excercise() {
        System.out.println("I am lazy person. I don't do excercise");
    }
}




    
