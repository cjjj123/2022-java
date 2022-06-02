import com.cjj.config.MyConfig;
import com.cjj.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * xiangjiaoyun
 * author:chenjianjie
 * Date:2022/5/30
 * Time:18:55
 */
public class Mytest {

    @Test
    public void test01(){
        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        User user = context.getBean("getUser", User.class);
        System.out.println(user);
    }
}
