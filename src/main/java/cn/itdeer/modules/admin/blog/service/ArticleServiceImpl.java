package cn.itdeer.modules.admin.blog.service;

import cn.itdeer.modules.admin.blog.entity.Article;
import org.springframework.data.domain.Page;

/**
 * 描述：博客-文章-Service实现层
 * 创建人：Itdeer
 * 创建时间：2017/8/18 0:01
 */
public class ArticleServiceImpl implements ArticleService{

    @Override
    public Page<Article> findAll(Integer page) {
        return null;
    }
}
