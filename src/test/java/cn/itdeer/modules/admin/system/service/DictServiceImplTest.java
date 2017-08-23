package cn.itdeer.modules.admin.system.service;

import cn.itdeer.ItdeerApp;
import cn.itdeer.modules.admin.system.repository.DictRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * Created by sundafei on 17-8-23.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = ItdeerApp.class)
public class DictServiceImplTest {

    @Autowired
    private DictRepository dictRepository;

    @Test
    public void type() throws Exception {
        System.out.println(dictRepository.type());

    }

}