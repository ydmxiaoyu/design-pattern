package design.bridgepattern;

import design.bridgepattern.priority.AbstractMsgPriority;
import design.bridgepattern.priority.NormalMsgPriority;
import design.bridgepattern.priority.UrgentMsgPriority;
import design.bridgepattern.role.AfterDevRole;
import design.bridgepattern.role.FrontDevRole;
import design.bridgepattern.role.AbstractReceiveUserRole;
import design.bridgepattern.service.SendMsgType;
import design.bridgepattern.service.impl.SendByEmail;
import design.bridgepattern.service.impl.SendBySms;

/**
 * 桥接模式
 * @author xiaoyu
 * @date 2020/3/19
 */
public class BridgePattern {

    public static void main(String[] args) {
        //以邮件形式发送
        SendMsgType sendMsgType = new SendByEmail();
        //创建紧急消息实例
        AbstractMsgPriority abstractMsgPriority = new UrgentMsgPriority(sendMsgType);
        abstractMsgPriority.sendMsg("回来帮我带份盒饭","小羽");

        //切换成正常速度的信息
        abstractMsgPriority = new NormalMsgPriority(sendMsgType);
        abstractMsgPriority.sendMsg("回来帮我带份盒饭","小羽");

        System.out.println("--------------一条无情的分割线-----------------------");

        //以手机短信形式发送
        sendMsgType = new SendBySms();
        //正常
        abstractMsgPriority = new UrgentMsgPriority(sendMsgType);
        abstractMsgPriority.sendMsg("回来帮我带瓶啤酒","小羽");

        //加急
        abstractMsgPriority = new UrgentMsgPriority(sendMsgType);
        abstractMsgPriority.sendMsg("回来帮我带瓶啤酒","小羽");


        System.out.println("--------------一条无情的分割线-----------------------");
        AbstractReceiveUserRole frontDevRole = new FrontDevRole("天天向上");
        AbstractReceiveUserRole afterDevRole = new AfterDevRole("纵横四海");

        abstractMsgPriority.sendMsg("回来带包烟", frontDevRole);

        sendMsgType = new SendByEmail();
        abstractMsgPriority = new NormalMsgPriority(sendMsgType);
        abstractMsgPriority.sendMsg("回来带包烟", afterDevRole);


    }}
