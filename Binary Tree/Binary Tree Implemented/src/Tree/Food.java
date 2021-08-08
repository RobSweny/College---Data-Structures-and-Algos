package Tree;

public class Food implements Comparable<Food> {

    String name;
    double price;
    int healthIndex;

    public Food(String name, double price, int healthIndex) {
        this.name = name;
        this.price = price;
        // give an error if an object is created out of bounds
        if (healthIndex < 0 || healthIndex > 10) {
            System.out.println("Attempted to create object for " + name + ", but the health index is out of bounds");
            System.out.println("Health Index must be between 1 and 10");
        } else {
            this.healthIndex = healthIndex;
        }
    }

    @Override
    // CompareTo gives us -1 if it's less than, 0 if it's equal and 1 if it's greater than
    public int compareTo(Food otherFood) {
        if (this.healthIndex == otherFood.getHealthIndex()) return 0;
        if (this.healthIndex > otherFood.getHealthIndex()) {
            return 1;
        } else {
            return -1;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getHealthIndex() {
        return healthIndex;
    }

    public void setHealthIndex(int healthIndex) {
        if (healthIndex < 0 || healthIndex > 10) {
            System.out.println("Health Index must be between 1 and 10");
        } else {
            this.healthIndex = healthIndex;
        }
    }
}
