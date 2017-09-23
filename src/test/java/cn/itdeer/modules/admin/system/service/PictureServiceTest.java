package cn.itdeer.modules.admin.system.service;

import cn.itdeer.ItdeerApp;
import cn.itdeer.modules.admin.system.repository.PictureRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 2017/9/24.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = ItdeerApp.class)
public class PictureServiceTest {

    @Autowired
    private PictureRepository pictureRepository;


    @Test
    public void findById() throws Exception {
        System.out.println(pictureRepository.findOne("3af2fcfbb2ab42bd91ed6e24afcb0392"));
    }

}