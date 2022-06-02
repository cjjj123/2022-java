import com.cjj.pojo.Hello;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * xiangjiaoyun
 * author:chenjianjie
 * Date:2022/5/30
 * Time:10:19
 */
public class MyTest {

    @Test
    public void testHello(){
        // 获取spring的上下文对象
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application.xml");
        Hello hello = applicationContext.getBean("hello",Hello.class);
        System.out.println(hello);
    }
}
