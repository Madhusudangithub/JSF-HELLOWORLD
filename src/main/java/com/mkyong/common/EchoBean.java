package com.mkyong.common;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.event.ActionEvent;


@ManagedBean
@RequestScoped
public class EchoBean {

	
	
	private String name;
	private int count;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
	
	
	public void countListener(ActionEvent actionEvent)
	{
		count =name.length();
	}
	
	
	
	
}
