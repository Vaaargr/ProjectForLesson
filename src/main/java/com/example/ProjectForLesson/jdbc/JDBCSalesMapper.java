package com.example.ProjectForLesson.jdbc;

import org.springframework.jdbc.core.RowMapper;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCSalesMapper implements RowMapper<JDBCSales> {
    @Override
    public JDBCSales mapRow(ResultSet rs, int rowNum) throws SQLException {
        int id = rs.getInt("id");
        long amount = rs.getLong("amount");
        Date incomingDate = rs.getDate("incoming_date");
        Date saleDate = rs.getDate("sale_date");
        int productID = rs.getInt("productid");
        return new JDBCSales(id,amount,incomingDate,saleDate,productID);
    }
}
