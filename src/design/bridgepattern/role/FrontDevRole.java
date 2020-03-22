package design.bridgepattern.role;

/**
 * 前端工程师
 * @author xiaoyu
 * @date 2020/3/19
 */
public class FrontDevRole extends AbstractReceiveUserRole {


    public FrontDevRole(String name) {
        super(name);
        this.role = "前端工程师";
    }
}
