package cn.bugstack.mybatis.session;

import cn.bugstack.mybatis.binding.MapperRegistry;
import cn.bugstack.mybatis.mapping.MappedStatement;

import java.util.HashMap;
import java.util.Map;

/**
 * @author mahuic
 * @create 2024-10-23 8:43
 * @Description 配置项
 */
public class Configuration {
    /**
     * 映射注册机
     */
    protected MapperRegistry mapperRegistry = new MapperRegistry(this);

    /**
     * 映射的语句，存在Map里
     */
    private final Map<String, MappedStatement>mappedStatements= new HashMap<>();

    public void addMappers(String packageName) {
        mapperRegistry.addMappers(packageName);
    }

    public <T> void addMapper(Class<T> type) {
        mapperRegistry.addMapper(type);
    }

    /**
     * 获取映射器
     *
     * @param type
     * @param sqlSession
     * @param <T>
     * @return
     */
    public <T> T getMapper(Class<T> type, SqlSession sqlSession) {
        return mapperRegistry.getMapper(type, sqlSession);
    }

    public boolean hasMapper(Class<?> type) {
        return mapperRegistry.hasMapper(type);
    }

    public void addMappedStatement(MappedStatement ms) {
        mappedStatements.put(ms.getId(), ms);
    }

    public MappedStatement getMappedStatement(String id) {
        return mappedStatements.get(id);
    }

}
