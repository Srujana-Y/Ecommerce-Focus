package com.Model;

import java.io.Serializable;


import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Component
@Entity

public class Category implements Serializable
{
	private static final long serialVersionUID = 1L;
	@Id
	private int cid;
	private String name;
	
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
