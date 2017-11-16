package cn.itdeer.modules.admin.blog.service;

import cn.itdeer.common.base.BasePageBuilder;
import cn.itdeer.common.config.ConfigProperties;
import cn.itdeer.common.exception.ValidateException;
import cn.itdeer.modules.admin.blog.entity.Article;
import cn.itdeer.modules.admin.blog.repository.ArticleRepository;
import cn.itdeer.modules.admin.system.service.PictureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.Date;


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
    private PictureService pictureService;

    @Override
    public void save(Article article) throws ValidateException {
        if(article.getTitle()==null || "".equals(article.getTitle())){
            throw new ValidateException("文章标题不能为空！");
        }

        if(article.getPictureId() == null || "".equals(article.getPictureId())){
            article.setPictureId(configProperties.getSystemDefaultPictureId());
            article.setPictureUrl(pictureService.findById(configProperties.getSystemDefaultPictureId()).getUrl());
        }else{
//            article.setPictureUrl(pictureService.findById(article.getPictureId()).getUrl());

            article.setPictureId(configProperties.getSystemDefaultPictureId());
            article.setPictureUrl(pictureService.findById(configProperties.getSystemDefaultPictureId()).getUrl());
        }

        //User user = (User)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        article.setUserId("admin");
        article.setUserName("admin");

        article.setCreateDate(new Date());
        article.setReleaseState(false);

       articleRepository.save(article);
    }

    @Override
    public void edit(Article article) throws ValidateException {
        Article find_article = articleRepository.findOne(article.getId());
        find_article.setTextContent(article.getTextContent());
        find_article.setHtmlContent(article.getHtmlContent());

        find_article.setEditDate(new Date());
        articleRepository.save(find_article);
    }



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

    @Override
    public void delete(String id) {
        articleRepository.delete(id);
    }
}
