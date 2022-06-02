import com.cjj.service.UserService;
import com.cjj.service.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * xiangjiaoyun
 * author:chenjianjie
 * Date:2022/5/31
 * Time:16:48
 */
public class MyTest {

    @Test
    public void testApi(){
        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.add();
    }
}
