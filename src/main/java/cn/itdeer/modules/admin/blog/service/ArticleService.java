package cn.itdeer.modules.admin.blog.service;

import cn.itdeer.modules.admin.blog.entity.Article;
import org.springframework.data.domain.Page;

/**
 * 描述：博客-文章-Service接口层
 * 创建人：Itdeer
 * 创建时间：2017/8/18 0:01
 */
public interface ArticleService {

    /**
     * 分页-查询所有
     * @param page
     * @return
     */
    Page<Article> findAll(Integer page);

    Article findById(String id);
}
