package design.bridgepattern.service.impl;

import design.bridgepattern.role.AbstractReceiveUserRole;
import design.bridgepattern.service.SendMsgType;

/**
 * 手机短信方式发送
 * @author xiaoyu
 * @date 2020/3/19
 */
public class SendBySms implements SendMsgType {

    @Override
    public void doSend(String msg, String toUser) {
        System.out.println("发送短信：" + msg + "。给：" + toUser);
    }

    @Override
    public void doSend(String msg, AbstractReceiveUserRole abstractReceiveUserRole) {
        System.out.println("发送短信：" + msg + "。给：" + abstractReceiveUserRole.getName() + "(" + abstractReceiveUserRole.getRole() + ")");
    }
}
