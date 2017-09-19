package cn.itdeer.modules.admin.blog.service;

import cn.itdeer.common.base.BasePageBuilder;
import cn.itdeer.common.config.ConfigProperties;
import cn.itdeer.modules.admin.blog.entity.Article;
import cn.itdeer.modules.admin.blog.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

/**
 * 描述：博客-文章-Service实现层
 * 创建人：Itdeer
 * 创建时间：2017/8/18 0:01
 */
@Service
public class ArticleServiceImpl implements ArticleService{

    @Autowired
    private ConfigProperties configProperties;

    @Autowired
    private ArticleRepository articleRepository;

    //定义降序Sort
    private Sort sort = new Sort(Sort.Direction.ASC,"createDate");

    @Override
    public Page<Article> findAll(Integer page) {
        return articleRepository.findAll(BasePageBuilder.create(page,configProperties.getSystemPagesize(),sort));
    }

    @Override
    public Article findById(String id) {
        return articleRepository.findOne(id);
    }
}
