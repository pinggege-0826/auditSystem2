package com.lovo.audit.websocket;


import com.lovo.audit.entity.cpy.CompanyEntity;
import com.lovo.audit.entity.lh.MarketingEntity;
import com.lovo.audit.entity.lxj.SpecificationEntity;
import com.lovo.audit.service.cpy.ICompanyService;
import com.lovo.audit.service.lh.IMarketingService;
import com.lovo.audit.service.lh.ISpecificationService;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.websocket.*;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArraySet;

@ServerEndpoint("/websocket")
@Component
public class WebSocketServer {

    private static CopyOnWriteArraySet<WebSocketServer> sessions = new CopyOnWriteArraySet<WebSocketServer>();

    //与某个客户端的连接会话，需要通过它来给客户端发送数据
    private Session session;
    //促销审核保存信息
    @Autowired
    private IMarketingService marketingService;
    @Autowired
    private ISpecificationService specificationService;

    //sb不当我写又要重写
    @Autowired
    private ICompanyService companyService;

    /**
     * 连接建立成功调用的方法*/
    @OnOpen
    public void onOpen(Session session) throws IOException {
        this.session = session;
        sessions.add(this);
       // SessionList.list.add(session);
    }
    @OnClose
    public void onClose() {
        //SessionList.list.remove(this);
        sessions.remove(this);
    }

    /**
     * 收到客户端消息后调用的方法
     * @param message
     * @param session
     */
    @OnMessage
    public void onMessage(String message, Session session) throws IOException, InterruptedException {
       //System.out.println("收到前端内容："+message);
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

    @RabbitListener(queues = "getSalesPassFromCheckQueue")
    public  void getMessage(String message) throws IOException {
        //保存在队列中的信息到数据库
        System.out.println(message);
        ObjectMapper om = new ObjectMapper();
        MarketingEntity ma = om.readValue(message,MarketingEntity.class);
        SpecificationEntity spe = new SpecificationEntity();
        marketingService.saveMarket(ma);
        specificationService.saveSpecification(spe);
        if (sessions.size() != 0) {
            for (WebSocketServer s : sessions) {
                if (s != null) {
                    s.session.getBasicRemote().sendText("cuXiao");
                }
            }
        }
    }
    @RabbitListener(queues = "getDataQueue")
    public  void companyMessage(String message) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        CompanyEntity company = mapper.readValue(message,CompanyEntity.class);
        companyService.addCompany(company);
        System.out.println(company);
        if (sessions.size() != 0) {
            for (WebSocketServer s : sessions) {
                if (s != null) {
                    s.session.getBasicRemote().sendText("cuXiao");
                }
            }
        }
    }
}
