//Polymorphism
public class Dog extends Animal {

    String txt2 = "Outer Class Accessed from Inner Class";

    public void eat(){
        System.out.println("Dog Eats Biscuit");
    }

    //innerClass
    static class InnerClass{
        String txt = "This text shows that, inner class is working.";
    }

    //outer class access from inner class
    class InClass{
        public String accessOuterClass(){
            return txt2;
        }
    }
}

