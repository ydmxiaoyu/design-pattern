package design.bridgepattern.service;

import design.bridgepattern.role.AbstractReceiveUserRole;

/**
 * 短信发送接口
 * @author xiaoyu
 * @date 2020/3/19
 */
public interface SendMsgType {

    /**
     * 发送信息
     * @param msg 内容
     * @param toUser 给谁
     */
    public void doSend(String msg, String toUser);

    /**
     * 发送信息
     * @param msg 内容
     * @param abstractReceiveUserRole 给谁，什么角色
     */
    public void doSend(String msg, AbstractReceiveUserRole abstractReceiveUserRole);

}
