package design.bridgepattern.priority;

import design.bridgepattern.role.AbstractReceiveUserRole;
import design.bridgepattern.service.SendMsgType;

/**
 * 信息优先级
 * @author xiaoyu
 * @date 2020/3/19
 */
public abstract class AbstractMsgPriority {

    protected SendMsgType sendMsgType;

    public AbstractMsgPriority(SendMsgType sendMsgType){
        this.sendMsgType = sendMsgType;
    }

    public void sendMsg(String msg, String toUser){
        this.sendMsgType.doSend(msg, toUser);
    }

    public abstract void sendMsg(String msg, AbstractReceiveUserRole abstractReceiveUserRole);

}
