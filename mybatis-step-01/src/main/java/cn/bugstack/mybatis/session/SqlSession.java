package cn.bugstack.mybatis.session;

/**
 * @author mahuic
 * @create 2024-10-15 17:25
 */
public interface SqlSession {

    <T> T selectOne(String statement);

    <T> T selectOne(String statement,Object parameter);

    <T> T getMapper(Class<T> type);
}
