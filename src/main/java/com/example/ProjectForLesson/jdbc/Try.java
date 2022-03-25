package com.example.ProjectForLesson.jdbc;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

public class Try {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");
        JDBCSalesRepository jdbc = new JDBCSalesRepository(new JdbcTemplate(ctx.getBean(DataSource.class)));
        jdbc.count();
        System.out.println(jdbc.findByID(1));
        List<JDBCSales> sales = jdbc.findByAmount(100);
        for (JDBCSales a: sales) {
            System.out.println(a);
        }
    }
}
