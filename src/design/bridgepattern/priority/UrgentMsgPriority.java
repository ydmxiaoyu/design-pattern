package design.bridgepattern.priority;

import design.bridgepattern.role.AbstractReceiveUserRole;
import design.bridgepattern.service.SendMsgType;

/**
 * 加急信息
 * @author xiaoyu
 * @date 2020/3/19
 */
public class UrgentMsgPriority extends AbstractMsgPriority {

    public UrgentMsgPriority(SendMsgType sendMsgType) {
        super(sendMsgType);
    }

    @Override
    public void sendMsg(String msg, String toUser) {
        msg = PriorityEnum.URGENT.getPriority() + msg;
        super.sendMsg(msg, toUser);
    }

    @Override
    public void sendMsg(String msg, AbstractReceiveUserRole abstractReceiveUserRole) {
        msg = PriorityEnum.URGENT.getPriority() + msg;
        this.sendMsgType.doSend(msg, abstractReceiveUserRole);
    }
}
