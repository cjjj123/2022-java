import com.cjj.mapper.UserMapper;
import com.cjj.pojo.User;
import com.cjj.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * xiangjiaoyun
 * author:chenjianjie
 * Date:2022/6/1
 * Time:9:37
 */
public class MyTest {


    // 改造前
    @Test
    public void testList(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = mapper.selectList();
        for (User user : users) {
            System.out.println(user);
        }
    }

    // 改造中
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        SqlSessionTemplate sqlSessionTemplate = context.getBean("sqlSessionTemplate", SqlSessionTemplate.class);
        UserMapper mapper = sqlSessionTemplate.getMapper(UserMapper.class);
        List<User> users = mapper.selectList();
        for (User user : users) {
            System.out.println(user);
        }
    }

    // 改造1.0
    @Test
    public void test01(){
        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        UserMapper userMapperImpl = context.getBean("userMapperImpl", UserMapper.class);
        List<User> users = userMapperImpl.selectList();
        for (User user : users) {
            System.out.println(user);
        }
    }

    // 改造2.0
    @Test
    public void test02(){
        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        UserMapper userMapperImpl = context.getBean("userImpl", UserMapper.class);
        List<User> users = userMapperImpl.selectList();
        for (User user : users) {
            System.out.println(user);
        }
    }


}
