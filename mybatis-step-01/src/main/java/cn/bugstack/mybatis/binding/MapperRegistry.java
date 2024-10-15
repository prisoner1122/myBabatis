package cn.bugstack.mybatis.binding;

import java.util.HashMap;
import java.util.Map;

/**
 * @author mahuic
 * @create 2024-10-15 17:19
 */
public class MapperRegistry {
    private final Map<Class<?>,MapperProxyFactory<?>> knownMappers=new HashMap<>();

    public <T> T getMapper(Class<T> type,){

    }
}
