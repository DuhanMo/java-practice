package com.kh.udp.server;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPServer {
    // UDP 데이터 전송용 객체
    public static void main(String[] args) {
        // 1. UDP server용 port를 설정

        int port = 8000;
        try {
            // 2. 서버용 소켓 객체 생성하기
            DatagramSocket socket = new DatagramSocket(port);

            // 3. 연결할 클라이언트와 정보를 주고받을 DatagramPocket 객체 생성
            DatagramPacket inPacket; // 클라이언트가 주는내용
            DatagramPacket outPacket;

            byte[] inMsg = new byte[100];
            byte[] outMsg = "서버에서 보내는 메세지 입니다.".getBytes();

            while(true){
                // 4. 전달받을 메세지를 담을 객체 연결
                inPacket = new DatagramPacket(inMsg,inMsg.length);
                // 5. 클라이언트가 전달한 메세지를 inPacket 에 담기
                socket.receive(inPacket);

                // 6. 전달할 클라이언트의 정보를 받아서 전송할 객체 생성
                InetAddress clientIp = inPacket.getAddress();
                int clientPort = inPacket.getPort();

                outPacket = new DatagramPacket(outMsg, outMsg.length,clientIp,clientPort);

                // 7. 소켓을 통해 전송할 내용을 클라이언트에게 보내기
                socket.send(outPacket);

                // 8. 받은 메세지를 확인

                System.out.println("받은 메세지 : " + new String(inMsg));

                break;


            }

        } catch (IOException e) {

        }

    }

}
