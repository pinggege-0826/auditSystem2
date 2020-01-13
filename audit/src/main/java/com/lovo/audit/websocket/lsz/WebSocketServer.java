package com.lovo.audit.websocket.lsz;



import com.lovo.audit.get.GetMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.websocket.*;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;

@ServerEndpoint("/websocket")
@Component
public class WebSocketServer {

    //与某个客户端的连接会话，需要通过它来给客户端发送数据
    private Session session;
    @Autowired
    GetMessage getMessage;
    /**
     * 连接建立成功调用的方法*/
    @OnOpen
    public void onOpen(Session session) throws Exception {
        this.session = session;
        //获得队列的数据
        String str= "测试";
     session.getBasicRemote().sendText(str);
    }
    @OnClose
    public void onClose() {

    }

    /**
     * 收到客户端消息后调用的方法
     * @param message
     * @param session
     */
   @OnMessage
    public void onMessage(String message, Session session) throws IOException, InterruptedException {

       System.out.println("收到前端内容："+message);

           this.sendMessage("");
           Thread.sleep(1000*3);

    }

    /**
     *
     * @param session
     * @param error
     */
    @OnError
    public void onError(Session session, Throwable error) {

        error.printStackTrace();
    }
    /**
     * 实现服务器主动推送
     */
    public void sendMessage(String message) throws IOException {
        this.session.getBasicRemote().sendText(message);
    }


}
