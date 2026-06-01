package model;

import enums.FurColor;
import enums.Habitat;

public class Cat extends Animal {

    private int lives;
    private FurColor furColor;
    private boolean isIndoor;
    private String favoriteFood;
    private int purringFrequency;
    private boolean isNeutered;

    public Cat(String name,
               int age,
               double weight,
               FurColor furColor,
               boolean isIndoor,
               String favoriteFood,
               int purringFrequency,
               boolean isNeutered) {

        super(
            name,
            30,
            age,
            weight,
            isIndoor ? Habitat.DOMESTIC : Habitat.URBAN,
            !isIndoor
        );

        this.lives = 7;
        this.furColor = furColor;
        this.isIndoor = isIndoor;
        this.favoriteFood = favoriteFood;
        this.purringFrequency = purringFrequency;
        this.isNeutered = isNeutered;
    }

    // OVERRIDE
    @Override
    public void makeSound() {
        System.out.println(
            getName() + " meows: Meow! (" +
            purringFrequency + " Hz)"
        );
    }

    // OVERRIDE
    @Override
    public void sleep() {
        System.out.println(
            getName() +
            " sleeps 14 hours in the warmest spot of the house."
        );
    }

    // OVERLOAD
    public void move(int distance, int speed) {
        System.out.println(
            getName() + " jumped " +
            distance + " meters at " +
            speed + " km/h."
        );
    }

    // OVERLOAD
    public void move(int distance, String target) {
        System.out.println(
            getName() +
            " silently approached the " +
            target + " for " +
            distance + " meters."
        );
    }

    public void purr() {
        System.out.println(
            getName() +
            " is purring at " +
            purringFrequency + " Hz."
        );
    }

    public void loseLife() {
        if (lives > 0) {
            lives--;
            System.out.println(
                getName() +
                " lost a life. Remaining lives: " +
                lives
            );
        } else {
            System.out.println(
                getName() +
                " has no lives remaining."
            );
        }
    }

    @Override
    public void displayInfo() {
        super.displayInfo();

        System.out.println("Lives:              " + lives);
        System.out.println("Fur color:          " + furColor.getDisplayName());
        System.out.println("Indoor:             " + (isIndoor ? "Yes" : "No"));
        System.out.println("Favorite food:      " + favoriteFood);
        System.out.println("Purring frequency:  " + purringFrequency + " Hz");
        System.out.println("Neutered:           " + (isNeutered ? "Yes" : "No"));
    }

    // Getters

    public int getLives() {
        return lives;
    }

    public FurColor getFurColor() {
        return furColor;
    }

    public boolean isIndoor() {
        return isIndoor;
    }

    public String getFavoriteFood() {
        return favoriteFood;
    }

    public int getPurringFrequency() {
        return purringFrequency;
    }

    public boolean isNeutered() {
        return isNeutered;
    }
}