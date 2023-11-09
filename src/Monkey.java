public class Monkey extends Animal{

    public Boolean standing;

    public Monkey(String name) {
        super(name, 2, "Ooh Ooh Ah Ah!");
        standing = true;
    }

    public void sitting() {
        if(standing) {
            standing = false;
            super.legs = 4;
        }

    }

    public void standingUp() {
        if(standing = false) {
            standing = true;
            super.legs = 2;
        }
    }

}

