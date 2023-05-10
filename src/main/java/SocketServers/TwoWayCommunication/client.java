package main.java.SocketServers.TwoWayCommunication;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class client {
    public static void main(String[] args) throws IOException {
        try{
            Socket s = new Socket("LocalHost", 4999);
            PrintWriter pr = new PrintWriter(s.getOutputStream());
            pr.println("Hello server");
            pr.flush();

            InputStreamReader in = new InputStreamReader(s.getInputStream());
            BufferedReader bf = new BufferedReader(in);

            String str = bf.readLine();
            System.out.println("Server: " + str);
        } catch (IOException e){
            throw new RuntimeException();
        }
    }
}
