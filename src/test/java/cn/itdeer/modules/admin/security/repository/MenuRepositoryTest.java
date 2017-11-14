package cn.itdeer.modules.admin.security.repository;

import cn.itdeer.modules.admin.security.entity.Menu;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Set;

import static org.junit.Assert.*;

/**
 * 描述：
 * 创建人：Itdeer
 * 创建时间：2017/11/14 23:05
 */

@SpringBootTest
@RunWith(SpringRunner.class)
public class MenuRepositoryTest {

    @Autowired
    private MenuRepository menuRepository;


    @Test
    public void save(){

        Menu menu = new Menu("系统管理", null, null, null);

        menuRepository.save(menu);
        menuRepository.save(new Menu("部门管理", "/depment", "_blank",menu));
        menuRepository.save(new Menu("日志管理", "/logs", "_blank",menu));
        menuRepository.save(new Menu("标签管理", "/tags", "_blank",menu));
    }

    @Test
    public void findByID(){

        Menu menu = menuRepository.getOne("297ef9275fbb167e015fbb169bda0000");
        System.out.println(menu.toString());
       /* if(menu.getChild() != null){
            Set<Menu> child = menu.getChild();
            System.out.println(child.toString());
        }else{
            System.out.println("没有子菜单");
        }*/



    }

}