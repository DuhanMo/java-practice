package com.kh.tcp.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

class TCPClient {
    public static void main(String[] args) {
        // 1. 서버가 설정한 port번호에 맞게
        //     연결하고자 하는 port번호를 설정한다.
        int port = 8888;

        String serverIp = "192.168.20.11"; // 루프백(localHost : 나 자신을 찾아가는 ip)
        try {
            // 2. 클라이언트에서 연결할 서버의 소켓 객체를 생성
            Socket socket = new Socket(serverIp, port);
            // 만약에 통신에 실패했다면 null을 돌려준다
            // 연결확인을 위해 if 조건문을 사용한다.
            if (socket != null) {
                // 3. 서버와 통신하기 위한 입출력 객체를 생성
                BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                PrintWriter pw = new PrintWriter(socket.getOutputStream());
            // 4. 메세지를 전송하고 서버로부터 전달된 메세지를 화면에 출력
                pw.println("안녕? 난 클라이언트야 ");
                pw.flush();

                System.out.println("서버로부터 받은 메세지 : ");
                System.out.println(br.readLine());

                pw.close();
                br.close();

            }
            socket.close();


        } catch (IOException e) {


        }


    }
}