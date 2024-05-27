package server;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;
import java.io.OutputStream;

public class HelloHandler implements HttpHandler {
    @Override
    public void handle(HttpExchange httpExchange) throws IOException {
        //System.out.println("I am here"); This will print in console
        //to print in server
        String resp="i am here in the hello handler with the thread name " + Thread.currentThread().getName();
        httpExchange.sendResponseHeaders(200,resp.length());//ok
        OutputStream outputStream=httpExchange.getResponseBody();
        outputStream.write(resp.getBytes());
        outputStream.flush();
        outputStream.close();


    }
}

