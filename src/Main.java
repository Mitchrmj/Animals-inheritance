import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        System.out.println("Animal crackers");
        Cow daisy = new Cow("Daisy");
        daisy.milk();
        daisy.say("hello");


        Dog spot = new Dog("Spot");
        spot.say("hello");
        spot.fetch("stick");
        spot.fetch("banana");
        spot.drop();
        spot.drop();

        Fish liam = new Fish("Liam");
        System.out.println(liam.getLegs());

        StBernard dave = new StBernard("Dave");
        dave.rescue("Liam");





        Monkey edward = new Monkey("Edward");
        System.out.println(edward.getLegs());

        ArrayList<Animal> animals = new ArrayList<>();

    }


}

