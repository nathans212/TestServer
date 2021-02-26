package me.nathans212.TestServer;

import com.sun.net.httpserver.HttpServer;
import me.nathans212.TestServer.request.CreateServer;

import java.net.InetSocketAddress;

public class TestServer {
    public static void main(String[] args) throws Exception{
        HttpServer server = HttpServer.create(new InetSocketAddress(25501), 0);
        server.createContext("/test", new CreateServer());
        server.setExecutor(null); // creates a default executor
        server.start();
        System.out.println("Started");
    }
}
