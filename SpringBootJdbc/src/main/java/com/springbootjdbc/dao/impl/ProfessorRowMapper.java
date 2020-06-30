package com.springbootjdbc.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.springbootjdbc.model.Professor;
import com.springbootjdbc.model.Professor;

public class ProfessorRowMapper implements RowMapper<Professor> {

	@Override
	public Professor mapRow(ResultSet rs, int rowNum) throws SQLException {
		Professor prof = new Professor();
		prof.setId(rs.getInt("id"));
		prof.setP_name(rs.getNString("p_name"));
		prof.setS_name(rs.getNString("s_name"));
		
		return prof;
	}

}
   