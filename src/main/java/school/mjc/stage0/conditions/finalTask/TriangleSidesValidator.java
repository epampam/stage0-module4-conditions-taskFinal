package school.mjc.stage0.conditions.finalTask;

public class TriangleSidesValidator {
    public void validate(double a, double b, double c) {
        System.out.println(a + b > c && a + c > b && b + c > a ? "this is a valid triangle" : "it's not a triangle");
    }
}