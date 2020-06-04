package kh.oop.tour.controller;

import kh.oop.tour.model.vo.Airline;
import kh.oop.tour.model.vo.Tourist;

public class TourController {

    private Airline al = new Airline();
    private Airline al1 = new Airline();
    private Tourist tt = new Tourist();

    {


        al.setCountry("미국행");
        al.setMileage(3000);
        al.setAirfare(300000);

        al1.setCountry("중국행");
        al1.setMileage(2000);
        al1.setAirfare(200000);

        tt.setMyMoney(1000000);
        tt.setMyMile(1000);


    }

    public TourController() {

    }

    // 목적지에 따른 항공 요금을 리턴 (아래 메소드도 동일)
    public int bringFare() {
        return al.getAirfare();
    }

    // 목적지1에 따른 항공 요금을 리턴 (아래 메소드도 동일)
    public int bringFare1() {
        return al1.getAirfare();
    }

    public int bringMile() {
        return al.getMileage();
    }

    public int bringMile1() {
        return al1.getMileage();
    }

    public int bringMyMoney() {
        return tt.getMyMoney();
    }

    public int bringMyMile() {
        return tt.getMyMile();
    }

    // 여행객의 보유금액을 변경
    public void setMyMoney(int myMoney) {
        tt.setMyMoney(myMoney);
    }

    public void setMyMile(int myMile) {
        tt.setMyMile(myMile);
    }


}
