package cn.bugstack.mybatis.session;

import cn.bugstack.mybatis.binding.MapperProxy;
import cn.bugstack.mybatis.binding.MapperRegistry;

/**
 * @author mahuic
 * @create 2024-10-16 7:58
 */
public class DefaultSqlSession implements SqlSession{
    
    private MapperRegistry mapperRegistry;

    public DefaultSqlSession(MapperRegistry mapperRegistry) {
        this.mapperRegistry = mapperRegistry;
    }

    @Override
    public <T> T selectOne(String statement) {
        return (T) ("你被代理了！" + statement);
    }

    @Override
    public <T> T selectOne(String statement, Object parameter) {
        return (T) ("你被代理了！" + "方法：" + statement + " 入参：" + parameter);
    }

    @Override
    public <T> T getMapper(Class<T> type) {
        return mapperRegistry.getMapper(type,this);
    }
}
