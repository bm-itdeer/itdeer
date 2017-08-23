package cn.itdeer.modules.admin.system.service;

import cn.itdeer.ItdeerApp;
import cn.itdeer.common.base.BasePageBuilder;
import cn.itdeer.common.config.ConfigProperties;
import cn.itdeer.modules.admin.system.entity.Logs;
import cn.itdeer.modules.admin.system.repository.LogsRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.Assert.*;

/**
 * Created by sundafei on 17-8-22.
 */

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ItdeerApp.class)
public class LogsServiceImplTest {


    @Autowired
    private LogsRepository logsRepository;
    @Autowired
    private ConfigProperties configProperties;

    @Test
    public void findByType() throws Exception {
        Sort sort = new Sort(Sort.Direction.DESC,"createDate");
        //Page<Logs> page = logsRepository.findByType("a",BasePageBuilder.create(1,configProperties.getSystemPagesize(),sort));

        DateFormat dateFormat1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date startDate = dateFormat1.parse("2017-08-17 21:23:41");
        Date endDate = dateFormat1.parse("2017-08-27 21:24:25");

        Page<Logs> page = logsRepository.findByCreateDateAfterAndCreateDateBefore(startDate,endDate,BasePageBuilder.create(0,10,sort));

        for (Logs logs :page){
            System.out.println("Page1:"+logs.toString());
        }
        System.out.println(page.getTotalPages());
        System.out.println(page.getTotalElements());
        System.out.println(page.getNumber());

    }

    @Test
    public void findAll() throws Exception {
    }

    @Test
    public void save() throws Exception {
    }

    @Test
    public void delete() throws Exception {

        logsRepository.deleteAll();
    }

}