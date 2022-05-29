package com.cjj.dao;

import com.cjj.pojo.Blog;

import java.util.List;
import java.util.Map;

/**
 * xiangjiaoyun
 * author:chenjianjie
 * Date:2022/5/23
 * Time:15:46
 */
public interface BlogMapper {

    // 插入数据
    int addBook(Blog blog);

    // 更新数据
    int updateBook(Map<String, Object> map);

    // 查询博客
    List<Blog> queryBlogIf(Map<String, Object> map);

    List<Blog> queryBlogChoose(Map<String, Object> map);

    List<Blog> queryBlogForeach(Map<String, Object> map);
}
