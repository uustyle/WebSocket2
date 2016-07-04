import javax.websocket.OnMessage;
import javax.websocket.server.ServerEndpoint;

//@WebServlet(urlPatterns={"/LoginForm"})
@ServerEndpoint("/echo")
public class SampleWebSocket {

    @OnMessage
    public String echo(String message) {
        System.out.println(message);
        return message;
    }



}