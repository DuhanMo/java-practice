package kh.run;

import kh.controller.BookManager;
import kh.controller.FoodManager;

public class Run {
    public static void main(String[] args) {
//        BookManager bk = new BookManager();
//        bk.fileSave("abc");

        FoodManager fd = new FoodManager();
        fd.fileSave();
    }
}
