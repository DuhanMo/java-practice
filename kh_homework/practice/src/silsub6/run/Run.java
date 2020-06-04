package silsub6.run;

import silsub6.model.vo.Book;

public class Run {
    public static void main(String[] args){
        Book bk1 = new Book();
        Book bk2 = new Book("제주 삼다수", "비상", "이상");
        Book bk3 = new Book("제주 삼다수v2", "비상", "이상",18500,10.0);

        System.out.println(bk1.information());
        System.out.println(bk2.information());
        System.out.println(bk3.information());

    }
}
