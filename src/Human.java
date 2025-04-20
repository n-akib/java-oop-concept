public class Human extends Animal{
    public String name = "Luffy";
    private int hand = 2;

    //inheritance
    public void running(){
        Human human = new Human();
        System.out.println(human.name + " Streches " + human.hand + " Hand " + "and runs with "+human.leg + " legs");
        //private filed "type" inherited from animal
        System.out.println("Type of Luffy:" + human.getType());
    }

    public void eat(){
        System.out.println("Human eats meats");
    }

}
