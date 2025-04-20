public class Animal {

    public int leg = 2;
    public String color;
    public int eyes;
    private String type = "Man" ;

    //Encapsulation
    public String getType() {
        return type;
    }
    public void setType( String newType){
        this.type = newType;
    }

    //accessing public field from child class
    public void myMethod(){
        Human obj = new Human();
        System.out.println(obj.name);
    }

    public void eat(){
        System.out.println("Animal eats");
    }



}
