package kh.model.vo;
import java.io.Serializable;
import java.util.Comparator;


public class Book implements Comparator {
    private static final long serialVersionUID = 3799235693248447677L;

    private String title;
    private int price;

    public Book() {}

    public Book(String title, int price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", price=" + price +
                '}';
    }


    @Override
    public int compare(Object o1, Object o2) {

        return 0;
    }
}
