public class Main {

    public static void main(String[] args) {
        Tree<Car> carTree = new Tree<Car>();

        Car ford = new Car(2, "ford", 1995, 2000);
        Car vw = new Car(4, "volkswagen", 1992, 4000);
        Car tesla = new Car(3, "tesla", 2001, 5000);
        Car crapcar = new Car(1, "tesla", 2001, 1000);

        carTree.insertNode(ford);
        carTree.insertNode(vw);
        carTree.insertNode(tesla);
        carTree.insertNode(crapcar);

        System.out.print(carTree.preOrder());

    }
}
