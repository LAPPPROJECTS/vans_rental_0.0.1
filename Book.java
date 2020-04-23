public class Book {


    private String tytle;
    private String author;

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    private double price;

    public String getTytle() {
        return tytle;
    }

    public Book(String tytle, String author, double price) {
        this.tytle = tytle;
        this.author = author;
        this.price = price;
    }
}
