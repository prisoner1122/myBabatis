package cn.bugstack.mybatis.session;

import cn.bugstack.mybatis.binding.MapperRegistry;

/**
 * @author mahuic
 * @create 2024-10-16 8:33
 */
public class DefaultSqlSessionFactory implements SqlSessionFactory{

    private final MapperRegistry mapperRegistry;

    public DefaultSqlSessionFactory(MapperRegistry mapperRegistry) {
        this.mapperRegistry = mapperRegistry;
    }

    @Override
    public SqlSession openSession() {
        return new DefaultSqlSession(mapperRegistry);
    }
}
