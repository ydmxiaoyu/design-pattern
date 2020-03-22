package design.bridgepattern.role;

/**
 * 后端开发工程师
 * @author xiaoyu
 * @date 2020/3/19
 */
public class AfterDevRole extends AbstractReceiveUserRole {


    public AfterDevRole(String name) {
        super(name);
        this.role = "后端工程师";
    }
}
