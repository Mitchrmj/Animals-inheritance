public class StBernard extends Dog {
    public StBernard(String name) {
        super(name);
    }
    public void rescue(String name) {
        fetch(name);
        System.out.println(this.name + " gives some brandy to " + name);
    }
}
