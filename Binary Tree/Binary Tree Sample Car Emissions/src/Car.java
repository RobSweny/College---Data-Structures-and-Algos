public class Car implements Comparable<Car> {

    private int emissions;
    private String model;
    private int year;
    private float price;

    public Car(int emissions, String model, int year, float price) {
        this.emissions = emissions;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    @Override
    public int compareTo(Car otherCar) {
        if (this.emissions == otherCar.getEmissions()) return 0;
        if (this.emissions > otherCar.getEmissions()) {
            return 1;
        } else {
            return -1;
        }
    }

    @Override
    public String toString() {
        return model;

    }

    public int getEmissions() {
        return emissions;
    }

    public void setEmissions(int emissions) {
        this.emissions = emissions;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
