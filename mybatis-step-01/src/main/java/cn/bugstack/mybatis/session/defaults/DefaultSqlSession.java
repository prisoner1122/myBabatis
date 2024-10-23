package cn.bugstack.mybatis.session.defaults;

import cn.bugstack.mybatis.binding.MapperRegistry;
import cn.bugstack.mybatis.session.Configuration;
import cn.bugstack.mybatis.session.SqlSession;

/**
 * @author mahuic
 * @create 2024-10-16 7:58
 */
public class DefaultSqlSession implements SqlSession {
    
    private Configuration configuration;

    public DefaultSqlSession(Configuration configuration) {
        this.configuration = configuration;
    }

    @Override
    public <T> T selectOne(String statement) {
        return (T) ("你被代理了！" + statement);
    }

    @Override
    public <T> T selectOne(String statement, Object parameter) {
        return (T) ("你被代理了！" + "方法：" + statement + " 入参：" + parameter);
    }

    /**
     * 用于获取映射器对象
     *
     * @param <T>
     * @param type mapper接口class
     * @return
     */
    @Override
    public <T> T getMapper(Class<T> type) {
        return configuration.getMapper(type,this);
    }

    @Override
    public Configuration getConfiguration() {
        return configuration;
    }
}
