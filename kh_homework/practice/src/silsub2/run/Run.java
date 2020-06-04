package silsub2.run;

import silsub2.model.vo.Product;

public class Run {
    public static void main(String[] args) {
        Product p1 = new Product();

        p1.setpName("숫가락");
        p1.setPrice(5000000);
        p1.setBrand("롯데");

        System.out.println(p1.information());
    }
}
