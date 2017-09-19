package cn.itdeer.modules.admin.blog.repository;

import cn.itdeer.modules.admin.blog.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

/**
 * 描述：博客-文章-Data Repository层
 * 创建人：Itdeer
 * 创建时间：2017/8/18 0:06
 */

@Repository
@Transactional
public interface ArticleRepository extends JpaRepository<Article,String> {

}
