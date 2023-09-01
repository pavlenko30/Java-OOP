
public class Product {

    private String name;

    private Double price;

    private Integer rating;



    public Product(String name, double price, int rating) {

        this.name = name;

        this.price = price;

        this.rating = rating;

    }



    public String getName() {

        return name;

    }



    public double getPrice() {

        return price;

    }



    public int getRating() {

        return rating;

    }

}


