package kh.controller;

import kh.model.vo.Book;
import sun.swing.BakedArrayList;

import java.io.*;
import java.util.ArrayList;

public class BookManager  {
    public void fileSave(String fileName){
        Book[] bArr = {new Book("자바를 정복하자", 35000)};
        FileOutputStream  fOut = null;
        ObjectOutputStream oOut;
        try

        {
            fOut = new FileOutputStream(fileName);
            oOut = new ObjectOutputStream(fOut);
            oOut.writeObject(bArr);
            oOut.flush();


        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fOut.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void fileSave()  {
        ArrayList <Book> arrayList = new ArrayList<>();
        arrayList.add(new Book("자바를 잡아라", 30000));
        arrayList.add(new Book("오라클 정복", 35000));
        arrayList.add(new Book("웹표준 2.0", 27500));
        arrayList.add(new Book("자바 Servlet/JSP", 28000));
        arrayList.add(new Book("ajax 사용법", 15000));

        System.out.println(arrayList);

    }
}
