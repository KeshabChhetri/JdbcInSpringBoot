  package com.springbootjdbc.model;

public class Professor {
    private Integer id;
    private String p_name;
    private String s_name;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getP_name() {
		return p_name;
	}
	public void setP_name(String p_name) {
		this.p_name = p_name;
	}
	public String getS_name() {
		return s_name;
	}
	public void setS_name(String s_name) {
		this.s_name = s_name;
	}
	@Override
	public String toString() {
		return "Professor [id=" + id + ", p_name=" + p_name + ", s_name=" + s_name + "]";
	}
    
    

}

