
public class Body {
    private char name;
    private double mass;
    private double diameter;
    private Body orbits;
    private double meandistance;
    public Body(char name, double mass, double diameter, Body orbits, double meandistance) {
        this.name = name;
        this.mass = mass;
        this.diameter = diameter;
        this.orbits = orbits;
        this.meandistance = meandistance;
    }
    /*public static void main(String[] args) {
        System.out.println("Hello World!");
    }*/
}
