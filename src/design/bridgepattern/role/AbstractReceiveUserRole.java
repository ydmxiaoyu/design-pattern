package design.bridgepattern.role;

/**
 * 接收短信用户的角色
 * @author xiaoyu
 * @date 2020/3/19
 */
public abstract class AbstractReceiveUserRole {

    protected String role;
    protected String name;

    public AbstractReceiveUserRole(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public String getName() {
        return name;
    }
}
