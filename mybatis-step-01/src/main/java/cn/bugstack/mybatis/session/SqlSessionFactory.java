package cn.bugstack.mybatis.session;

/**
 * @author mahuic
 * @create 2024-10-16 7:57
 */
public interface SqlSessionFactory {
    /**
     * 打开一个 session
     * @return SqlSession
     */
    SqlSession openSession();
}
