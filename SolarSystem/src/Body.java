
public class Body {
    private String name;
    private double mass;
    private double diameter;
    private Body orbits;
    private double meandistance;
    public Body(String name, double mass, double diameter, Body orbits, double meandistance) {
        this.name = name;
        this.mass = mass;
        this.diameter = diameter;
        this.orbits = orbits;
        this.meandistance = meandistance;
    }
    public getData(){
        System.out.println("Name of the body: " + name + " " + "Mass: " + mass + " " + "Diameter: " + diameter + " " + "What it orbits: " + orbits + " " + "Mean distance from what it orbits: " + meandistance);
    }
}