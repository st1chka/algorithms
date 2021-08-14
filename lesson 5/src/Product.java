public class Product {

    private  String title;
    private  int Weight ;
    private  int price ;

    public Product(String title, int weight, int price) {
        this.title = title;
        Weight = weight;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getWeight() {
        return Weight;
    }

    public void setWeight(int weight) {
        Weight = weight;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "название = '" + title + '\'' +
                ", вес = " + Weight +
                ", цена = " + price +
                '}';
    }
}
