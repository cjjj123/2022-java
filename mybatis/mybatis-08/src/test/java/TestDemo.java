import com.cjj.dao.UserMapper;
import com.cjj.pojo.User;
import com.cjj.util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

/**
 * 缓存测试
 * xiangjiaoyun
 * author:chenjianjie
 * Date:2022/5/28
 * Time:9:05
 */
public class TestDemo {


    // 测试一级缓存
    @Test
    public void testOne(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.getUser(1);
        System.out.println(user);

        System.out.println("=================");
        // 手动清理缓存
        sqlSession.clearCache();

        User user1 = mapper.getUser(1);
        System.out.println(user1);

        sqlSession.close();
    }

    // 测试二级缓存
    @Test
    public void testTwo(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        SqlSession sqlSession1 = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        UserMapper mapper1 = sqlSession1.getMapper(UserMapper.class);
        User user = mapper.getUser(1);
        System.out.println(user);
        sqlSession.close();
        User user1 = mapper1.getUser(1);
        System.out.println(user1);

        sqlSession1.close();

    }
}
