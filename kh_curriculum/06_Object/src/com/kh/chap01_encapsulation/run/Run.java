package com.kh.chap01_encapsulation.run;

import com.kh.chap01_encapsulation.model.vo.Account;

public class Run {
    public static void main(String[] args) {
        Account ac = new Account();
        System.out.println(ac.getName());

        //현재 잔액 조회
        ac.displayBalance();
        //1000만원 입금
        ac.deposit(10000000);
        ac.displayBalance();
        //1000만원 입금
        ac.deposit(10000000);
        ac.displayBalance();
        //200만원 출금
        ac.withdraw(2000000);
        ac.displayBalance();
        //aaa가 나의 주소를 통해 돈을 빼감

        System.out.println();
        System.out.println(ac.getBalance());
        ac.setBalance(0);
        System.out.println(ac.getBalance());

        ac.withdraw(3000000);
        ac.displayBalance();

        Account ac1 = new Account();
//        ac.getName() = "aaa";
//        System.out.println(ac.getName());



    }
}
