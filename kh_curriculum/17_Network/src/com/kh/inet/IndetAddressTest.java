package com.kh.inet;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class IndetAddressTest {
    public static void main(String[] args) {
        IndetAddressTest inet = new IndetAddressTest();
        inet.method1();
    }
    public void method1() {
        // naver.com 정보를 확인
        System.out.println("------ www.naver.com ------");

        try {
            InetAddress ip = InetAddress.getByName("www.naver.com");
            System.out.println("getHostName() : " + ip.getHostName());
            System.out.println("getHostAddress() : " + ip.getHostAddress());
            System.out.println("toString() : " + ip);
            // 네이버가 가진 모든 ip 주소 가져오기
            InetAddress[] naverIpArr = InetAddress.getAllByName(ip.getHostName());
            for(InetAddress i : naverIpArr){
                System.out.println("네이버 ip : " + i);
            }
            // 내가 가진 아이피
            System.out.println("-------");
            ip = InetAddress.getByName("localhost");
            ip = InetAddress.getLocalHost();
            System.out.println("getHostAddress() : " + ip.getHostAddress());
            System.out.println("toString() : " + ip);

        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
