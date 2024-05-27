package server;

import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.concurrent.Executors;

public class WebserverDemo {
    public static void main(String[] args) throws IOException {
        HttpServer httpServer=HttpServer.create(new InetSocketAddress("localhost",9097),0);
        httpServer.setExecutor(Executors.newFixedThreadPool(4));
        httpServer.createContext("/hello",new HelloHandler());
        httpServer.createContext("/hello2",new Myname());
        httpServer.start();
    }
}
