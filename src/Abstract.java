//Abstraction
abstract class Abstract {
    public abstract void abstractMethod();

    public void mthd(){
        System.out.println(" Non Abstract method called.");
    }
}

class Abs extends Abstract {
    @Override
    public void abstractMethod() {
        System.out.println("This method is an abstract method, called from abstract class. ");
    }
}
