public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal();
        Human human = new Human();
        Dog dog = new Dog();
        Dog.InnerClass innerClass = new Dog.InnerClass();
        Dog.InClass inClass = dog.new InClass();

        animal.leg = 4;
        animal.color = "White";
        animal.eyes = 2;

        animal.setType("Dog");

        animal.myMethod();

        System.out.println("Leg Number: " + animal.leg +"\n" + "Color: " + animal.color +"\n" + "Eyes: " + animal.eyes +"\n" + "Name: " + animal.getType());


        human.running();

        //Polymorphism
        animal.eat();
        human.eat();
        dog.eat();

        //innerClass
        System.out.println(innerClass.txt);

        //OuterClass accessing from inner class
        System.out.println(inClass.accessOuterClass());

        //abstraction
        Abs abs = new Abs();
        abs.abstractMethod();
        abs.mthd();

        Pig myPig = new Pig();
        myPig.animalSound();
        myPig.sleep();
        myPig.myOtherMethod();

        //recursion
        int result = sum(5, 10);
        System.out.println(result);
    }
    public static int sum(int start, int end) {
        if (end > start) {
            return end + sum(start, end - 1);
        } else {
            return end;
        }

    }

}
