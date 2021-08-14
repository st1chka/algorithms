import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    static int number = 3;
    static int degree = 8;
    static List<Product> backPack = new ArrayList<>();
    static List<Product> store = new ArrayList<>();
    static List<Product> cart = new ArrayList<>();
    //    static int index = 0;
    static int indexCart = 0;
    static int indexStore = 0;

    public static void main(String[] args) {

//        countdown(number, degree);
        product();
        cart(indexStore, indexCart);

    }

    private static void countdown(int value, int degree) {

        if (degree <= 1) {
            return;
        } else {
            int sum = value * number;
            System.out.println(sum);
            --degree;
            countdown(sum, degree);
        }

    }

    private static void cart(int indexStore, int indexCart) {

        if (store.get(indexStore).getPrice() < store.get(indexStore+1).getPrice() ) {
//            cart.clear();
            cart.add(store.get(indexStore+1));
            System.out.println(cart.get(indexCart));
        }
        ++indexStore;
        cart(indexStore, indexCart);


    }

    private static void product() {
        Product book = new Product("книга", 1, 600);
        Product binoculars = new Product("Бинокль", 2, 5000);
        Product kit = new Product("Набор", 4, 1500);
        Product notebook = new Product("Ноутбук", 3, 40000);
        Product pan = new Product("Кастрюля", 2, 50);

        store.add(book);
        store.add(binoculars);
        store.add(kit);
        store.add(notebook);
        store.add(pan);
    }


}
