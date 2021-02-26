package me.nathans212.TestServer.request;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import me.nathans212.TestServer.TestServer;
import me.nathans212.TestServer.actions.copyFolder;

import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

public class CreateServer implements HttpHandler {
        public void handle(HttpExchange t) throws IOException {
            String response = "This is the response";
            t.sendResponseHeaders(200, response.length());
            OutputStream os = t.getResponseBody();
            os.write(response.getBytes());
            os.close();
           // System.out.println(queryToMap(t.getRequestURI().getQuery()));
            System.out.println(System.getProperty("user.dir"));
            new copyFolder().copy(System.getProperty("user.dir")+"/Template","/Servers");
    }
    public Map<String, String> queryToMap(String query) {
        Map<String, String> result = new HashMap<>();
        for (String param : query.split("&")) {
            String[] entry = param.split("=");
            if (entry.length > 1) {
                result.put(entry[0], entry[1]);
            }else{
                result.put(entry[0], "");
            }
        }
        return result;
    }

}
