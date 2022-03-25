package com.example.ProjectForLesson.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public class JDBCSalesRepository {
    private final JdbcTemplate jdbcTemplate;
    final String COUNT_QUERY = "SELECT COUNT(id) FROM sales";
    final String FIND_BY_ID_QUERY = "SELECT * FROM sales WHERE ID=";
    final String INSERT_QUERY = "INSERT INTO sales VALUE(?,?,?,?,?)";
    final String FIND_BY_AMOUNT = "SELECT * FROM sales WHERE amount>";


    @Autowired
    public JDBCSalesRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void count(){
        System.out.println(jdbcTemplate.queryForObject(COUNT_QUERY, Integer.class));
    }

    public JDBCSales findByID(int id){
        return jdbcTemplate.queryForObject(FIND_BY_ID_QUERY + id, new JDBCSalesMapper());
    }

    public void input(JDBCSales forInput){
        jdbcTemplate.update(INSERT_QUERY,forInput.getId(),forInput.getAmount(),forInput.getIncomingDate(),forInput.getProductID(),forInput.getSaleDate());
    }

public List<JDBCSales> findByAmount(int amount){
        return jdbcTemplate.query(FIND_BY_AMOUNT + amount, new JDBCSalesMapper());
}
}
