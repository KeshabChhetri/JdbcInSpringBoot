package com.springbootjdbc.dao.impl;


import com.springbootjdbc.dao.ProfessorDao;
import com.springbootjdbc.dao.ProfessorDao;
import com.springbootjdbc.model.Professor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ProfessorDaoImpl implements ProfessorDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public void createProfessor(Professor professor)
    {
        String sql = "insert into Professor(p_name, s_name) values (?,?)";
        int update = jdbcTemplate.update(sql, professor.getP_name(), professor.getS_name());

        if (update == 1)
        {
            System.out.println("Professor is created");
        }
    }
    @Override
    public Professor getProfessorById(Integer id) {
    	String query="select * from Professor where id=?";
    	Professor prof=jdbcTemplate.queryForObject(query, new ProfessorRowMapper(), id);
        return prof;
    }

    @Override
    public void updateProfessorP_nameById(Integer id, String p_name) {
    	String updateSql="update Professor set p_name=? where id=?";
    	int update= jdbcTemplate.update(updateSql, p_name, id);
    	if (update == 1)
        {
    		System.out.println(" ");
            System.out.println("Professor name is updated........");
        }
    }

    @Override
    public void deleteProfessorById(Integer id) {
    	String deleteSql="delete from Professor where id=?";
    	int update= jdbcTemplate.update(deleteSql, id);
    	if (update == 1)
        {
            System.out.println("Professor is Deleted.......");
        }

    }
}
