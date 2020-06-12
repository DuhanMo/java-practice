package kh.controller;


import kh.model.vo.Food;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.HashMap;

public class FoodManager {
    public void fileSave(String fileName) {
        Food[] fArr = {new Food("사과", 20)};

        FileOutputStream fOut = null;
        ObjectOutputStream oOut = null;

        try {
            fOut = new FileOutputStream(fileName);
            oOut = new ObjectOutputStream(fOut);
            oOut.writeObject(fArr);
            oOut.flush();


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fOut.close();
                oOut.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }
    public void fileSave(){
        HashMap<Integer, Food> fList= new HashMap<Integer, Food>();

        fList.put(1, new Food("사과", 20));
        fList.put(2, new Food("바나나", 30));
        fList.put(3, new Food("토마토", 15));

        for (int i = 1; i <fList.size() + 1 ; i++) {
            System.out.println(fList.get(i));
        }

    }
}
