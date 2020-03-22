package design.bridgepattern.priority;

/**
 * 信息优先级枚举
 * @author xiaoyu
 * @date 2020/3/19
 */
public enum PriorityEnum {
    /**
     * 正常
     */
    NORMAL("正常速度!!--"),
    /**
     * 加急
     */
    URGENT("加急!!--");

    /**
     * 优先级
     */
    private String priority;

    PriorityEnum(String priority) {
        this.priority = priority;
    }

    public String getPriority() {
        return priority;
    }
}
