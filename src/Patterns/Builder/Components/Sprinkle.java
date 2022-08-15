package Patterns.Builder.Components;

public class Sprinkle {
    private double mass;
    private String composition;
    private boolean glutenFree;
    private double calories;

    public Sprinkle(double mass, String composition, boolean glutenFree, double calories) {
        this.mass = mass;
        this.composition = composition;
        this.glutenFree = glutenFree;
        this.calories = calories;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public String getComposition() {
        return composition;
    }

    public void setComposition(String composition) {
        this.composition = composition;
    }

    public boolean isGlutenFree() {
        return glutenFree;
    }

    public void setGlutenFree(boolean glutenFree) {
        this.glutenFree = glutenFree;
    }

    public double getCalories() {
        return calories;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }
}
