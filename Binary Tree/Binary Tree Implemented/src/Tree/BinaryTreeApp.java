package Tree;

public class BinaryTreeApp {

    public static void main(String[] args) {

        Tree<Food> foodTree = new Tree<Food>();

        /* String name; double price; int healthIndex */
        Food lettuce = new Food ("Lettuce", 2.99, 0);
        Food fastFoodBurger = new Food ("Burger", 6.99, 9);
        Food avacado = new Food ("Avacado", 2.75, 4);
        Food peanuts = new Food ("Peanuts", 3.50, 4);
        Food eggs = new Food ("Eggs", 1.99, 3);
        Food pizza = new Food ("Pizza", 12.95, 9);
        Food apples = new Food ("Apple", 0.95, 2);
        Food chocolate = new Food ("Chocolate", 2.40, 7);
        Food cereal = new Food ("Cereal", 3.40, 6);
        Food yoghurt = new Food ("Yoghurt", 3.25, 4);

        foodTree.insert(fastFoodBurger);
        foodTree.insert(lettuce);
        foodTree.insert(avacado);
        foodTree.insert(peanuts);
        foodTree.insert(eggs);
        foodTree.insert(pizza);
        foodTree.insert(apples);
        foodTree.insert(chocolate);
        foodTree.insert(cereal);
        foodTree.insert(yoghurt);

        System.out.println("Number of elements in tree " + foodTree.count());

        foodTree.maximumHealthyIndex();
        foodTree.minimumHealthyIndex();

        foodTree.printTree();



    }
}
