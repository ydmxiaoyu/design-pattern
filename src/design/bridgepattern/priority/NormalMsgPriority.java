package design.bridgepattern.priority;

import design.bridgepattern.role.AbstractReceiveUserRole;
import design.bridgepattern.service.SendMsgType;

/**
 * 普通信息
 * @author xiaoyu
 * @date 2020/3/19
 */
public class NormalMsgPriority extends AbstractMsgPriority {


    public NormalMsgPriority(SendMsgType sendMsgType) {
        super(sendMsgType);
    }

    @Override
    public void sendMsg(String msg, String toUser) {
        msg = PriorityEnum.NORMAL.getPriority() + msg;
        super.sendMsg(msg, toUser);
    }

    @Override
    public void sendMsg(String msg, AbstractReceiveUserRole abstractReceiveUserRole) {
        msg = PriorityEnum.NORMAL.getPriority() + msg;
        this.sendMsgType.doSend(msg, abstractReceiveUserRole);

    }
}
