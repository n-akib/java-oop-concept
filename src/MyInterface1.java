public interface MyInterface1 {
    public void animalSound(); // interface method (does not have a body)
    public void sleep(); // interface method (does not have a body)
}
interface MyInterface2 {
    public void myOtherMethod(); // interface method
}
class Pig implements MyInterface1, MyInterface2 {
    public void animalSound() {
        System.out.println("The pig says: wee wee");
    }

    public void sleep() {
        System.out.println("Zzz");
    }

    public void myOtherMethod(){
        System.out.println("This the Multiple Interface");
    }
}




