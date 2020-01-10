package com.cursmysql;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket = new ServerSocket(9999);
        Socket s = serverSocket.accept();

        InputStream inputStream = s.getInputStream();
        OutputStream outputStream = s.getOutputStream();


        BufferedWriter out = new BufferedWriter(new OutputStreamWriter (outputStream));
        BufferedReader in = new BufferedReader(new InputStreamReader (inputStream));

        String line = in.readLine();
        String lineA = in.readLine();
        String lineB = in.readLine();

        System.out.println("Clientul a trimis " +
                (Integer.parseInt(line) + Integer.parseInt(lineA) + Integer.parseInt(lineB)));


    }
}
