package com.kh.udp.client;

import javax.sound.sampled.Line;
import java.io.IOException;
import java.net.*;

public class UDPClient{
    // UDP 클라이언트용 객체 생성
    public static void main(String[] args) {
        // 1. 사용할 포트번호 설정
        int port = 8000;

        try {
            System.out.println("ddd");

            // 2. 연결할 DatagramSocket 생성
            DatagramSocket socket = new DatagramSocket();
            // 혼자할때는 로컬호스트
            InetAddress serverIp = InetAddress.getByName("localhost");

            // 3. 주고받을 byte 배열 선언
            byte[] sendMsg = "클라이언트 : 강사님 좋은수업감사합니다   ^_^ ".getBytes();
            byte[] recvMsg = new byte[100];

            // 4. 주고 받을 데이터 패킷 생성
            DatagramPacket inPacket = new DatagramPacket(recvMsg, recvMsg.length);
            DatagramPacket outPacket = new DatagramPacket(sendMsg,sendMsg.length,serverIp,port);

            socket.send(outPacket);
            socket.receive(inPacket);

            System.out.println(new String(recvMsg));

            socket.close();

        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}