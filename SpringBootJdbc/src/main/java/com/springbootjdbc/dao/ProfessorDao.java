package com.springbootjdbc.dao;

import com.springbootjdbc.model.Professor;

public interface ProfessorDao {
    public abstract void createProfessor(Professor professor);
    public abstract Professor getProfessorById(Integer id);
    public abstract void updateProfessorP_nameById(Integer id, String p_name);
    public abstract void deleteProfessorById(Integer id);


}
