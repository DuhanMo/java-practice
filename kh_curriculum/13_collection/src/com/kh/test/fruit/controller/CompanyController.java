package com.kh.test.fruit.controller;

import com.kh.test.fruit.model.vo.Company;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class CompanyController   {
    public static void main(String[] args) {
        HashSet<Company> set = new HashSet<Company>();
        set.add(new Company("KH정보교육원", 100));
        set.add(new Company("삼성전자", 200));

        System.out.println("값 삽입1 : " + set);

        set.add(new Company("KH정보교육원", 100));

        System.out.println("값 삽입2 : " + set);


    }
}
