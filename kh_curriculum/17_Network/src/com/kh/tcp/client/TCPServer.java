package com.kh.tcp.client;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
    // 0~65535
    // http://www.naver.com
    // ftp://www.microsoft.com/driver.zip?userid=admin&password=1234

    // 1. 서버의 port 번호 설정
    int port = 8888;

    // 2. 서버용 연결(소캣) 객체를 생성하기
    ServerSocket server;

    {
        try {
            server = new ServerSocket(port);
            System.out.println("서버가 클라이언트의 요청을 기다립니다.");

            // 3. 클라이언트의 요청을 기다린 후,
            //    클라이언트에게서 연결 요청이 올경우
            //    해당 클라이언트에 대한 소켓객체를 생성
            Socket client = server.accept();        // -> 사용자의 요청에 응답
            System.out.println(client.getInetAddress().getHostAddress() + "님 에게서 요청이 들어왔습니다.");

            // 4. 연결된 클라이언트와 입출력 스트림 생성
            InputStream in = client.getInputStream();
            OutputStream out = client.getOutputStream();

            // 5. 버퍼 보조 스트림을 사용하여 입출력 성능을 개선
            BufferedReader br = new BufferedReader(new InputStreamReader(in));

            PrintWriter pw = new PrintWriter(out);

            // 6. 생성한 스트림을 통해 데이터를 읽고 쓰기
            String msg = br.readLine();
            System.out.println("받은 메세지 : " + msg);

            pw.println();
            pw.flush();

            // 7. 사용한 스트림 객체와 소켓객체를 종료
            pw.close();
            br.close();

            out.close();
            in.close();

            server.close();


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
