package cn.itdeer.modules.admin.system.service;

import cn.itdeer.modules.admin.system.entity.Dict;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * 描述：系统-字典-Service接口层-测试
 * 创建人：Itdeer
 * 创建时间：2017/10/9 0:08
 */

@SpringBootTest
@RunWith(SpringRunner.class)
public class DictServiceTest {

    @Autowired
    private DictService dictService;


    @Test
    public void save2() throws Exception {

    }

    @Test
    public void findById3() throws Exception {

        Dict dict = dictService.findById3("297ef9275efc90cf015efc912fe80000");

        Assert.assertEquals(33,dict.getSort());

    }

}