package com.muhardin.endy.belajar.websecurity.dao;

import com.muhardin.endy.belajar.websecurity.BelajarWebsecurityApplication;
import com.muhardin.endy.belajar.websecurity.entity.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = BelajarWebsecurityApplication.class)
@Sql(
        scripts = {"/data/clean-data.sql", "/data/sample-users.sql"}
)
public class UserDaoTests {
    @Autowired private UserDao userDao;
    
    @Test
    public void testCariSemuaData(){
        Page<User> data = userDao.findAll(new PageRequest(0,10));
        Assert.assertEquals(new Long(6), new Long(data.getTotalElements()));
    }
}
