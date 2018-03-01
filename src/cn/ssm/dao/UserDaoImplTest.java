package cn.ssm.dao;

import cn.ssm.po.User;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserDaoImplTest {
    private ApplicationContext applicationContext;

    //在setup这个方法中得到spring容器
    @Before
    public void setUp() throws Exception {
        applicationContext = new ClassPathXmlApplicationContext("classpath:config/spring/applicationContext.xml");
    }

    @Test
    public void findUserById() throws Exception {
        UserDao userDao = (UserDao) applicationContext.getBean("userDao");

        User u = userDao.findUserById(1);
        System.out.println(u);
    }
}
