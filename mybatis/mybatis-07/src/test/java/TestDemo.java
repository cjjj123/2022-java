import com.cjj.dao.BlogMapper;
import com.cjj.pojo.Blog;
import com.cjj.util.IDUtils;
import com.cjj.util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.*;

/**
 * xiangjiaoyun
 * author:chenjianjie
 * Date:2022/5/23
 * Time:16:03
 */
public class TestDemo {

    @Test
    public void idTest(){
        String id = IDUtils.getId();
        System.out.println(id);
    }

    @Test
    public void addTest(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        mapper.addBook(new Blog(IDUtils.getId(), "标题4", "作者4", new Date(), 4));
        sqlSession.close();
    }

    @Test
    public void query(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        Map<String, Object> map = new HashMap<>();
        //map.put("title", "标题2");
        map.put("author", "作者2");
        List<Blog> blogs = mapper.queryBlogIf(map);
        for (Blog blog : blogs) {
            System.out.println(blog);
        }
        sqlSession.close();
    }

    @Test
    public void queryChoose(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        Map<String, Object> map = new HashMap<>();
        //map.put("title", "标题2");
        map.put("author", "作者2");
        List<Blog> blogs = mapper.queryBlogChoose(map);
        for (Blog blog : blogs) {
            System.out.println(blog);
        }
        sqlSession.close();
    }

    @Test
    public void update(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        Map<String, Object> map = new HashMap<>();
        map.put("title", "标题2222");
        map.put("author", "作者22222");
        map.put("id","22805b8e81884395a3afd3d6ac4ebd0e");
        mapper.updateBook(map);
        sqlSession.close();
    }

    @Test
    public void foreach(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        Map<String, Object> map = new HashMap<>();
        List<String> ids = new ArrayList<>();
        ids.add("1");
        ids.add("2");
        map.put("ids",ids);
        List<Blog> blogs = mapper.queryBlogForeach(map);
        for (Blog blog : blogs) {
            System.out.println(blog);
        }
        sqlSession.close();
    }

}
