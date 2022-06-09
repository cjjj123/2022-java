import com.cjj.pojo.User;
import com.cjj.service.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * xiangjiaoyun
 * author:chenjianjie
 * Date:2022/6/8
 * Time:18:12
 */
public class Testdemo {

    @Test
    public void test01(){
        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        UserServiceImpl userServiceImpl = context.getBean("userServiceImpl", UserServiceImpl.class);
        List<User> list = userServiceImpl.getList();
        for (User user : list) {
            System.out.println(user);
        }

    }



}
