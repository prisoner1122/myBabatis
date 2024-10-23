package cn.bugstack.mybatis.mapping;

/**
 * @author mahuic
 * @description SQL 指令类型
 * @create 2024-10-23 8:35
 */
public enum SqlCommandType {
    /**
     *未知
     */
    UNKNOWN,
    /**
     *插入
     */
    SELECT,
    /**
     *更新
     */
    UPDATE,
    /**
     *插入
     */
    INSERT,
    /**
     *删除
     */
    DELETE;
}
