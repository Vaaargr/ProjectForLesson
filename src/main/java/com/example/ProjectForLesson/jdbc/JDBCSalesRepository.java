package com.example.ProjectForLesson.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class JDBCSalesRepository {
    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public JDBCSalesRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void count(){
        System.out.println(jdbcTemplate.queryForObject("SELECT COUNT(id) FROM sales", Integer.class));
    }

    public JDBCSales findByID(int id){
        JDBCSalesMapper mapper = new JDBCSalesMapper();
        return jdbcTemplate.queryForObject("SELECT * FROM sales WHERE ID=" + id, mapper);
    }
}
