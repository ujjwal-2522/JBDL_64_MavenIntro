package server;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;
import java.io.OutputStream;

public class Myname implements HttpHandler {
    @Override
    public void handle(HttpExchange httpExchange) throws IOException {
        int[] arr={12,13,14,15,16,17};
        int[] arr2=new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr2[i]=arr[arr.length-1-i];

        }
        String res="";
        for (int num: arr2) {
            res += num+" ";
            
        }
        httpExchange.sendResponseHeaders(200,res.length());
        OutputStream outputStream=httpExchange.getResponseBody();
        outputStream.write(res.getBytes());
        outputStream.flush();
        outputStream.close();


    }
}
