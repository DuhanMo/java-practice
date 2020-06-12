package com.kh.test.fruit.model.vo;

public class Company {
    private String name;
    private int numOfEmp;

    public Company(){}

    public Company(String name, int numOfEmp) {
        this.name = name;
        this.numOfEmp = numOfEmp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumOfEmp() {
        return numOfEmp;
    }

    public void setNumOfEmp(int numOfEmp) {
        this.numOfEmp = numOfEmp;
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", numOfEmp=" + numOfEmp +
                '}';
    }
    @Override
    public boolean equals(Object a) {
        Company obj = (Company) a;
        return (obj.name == this.name && obj.numOfEmp == this.numOfEmp);
    }
    @Override
    public int hashCode() {
        return (name + numOfEmp).hashCode();
    }
}
