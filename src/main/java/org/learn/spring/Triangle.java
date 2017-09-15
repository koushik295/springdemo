package org.learn.spring;

import java.util.ArrayList;
import java.util.List;

public class Triangle {
	
	private String type;
	private List<Point> pointLists = new ArrayList<>();
	

	public List<Point> getPointLists() {
		return pointLists;
	}

	public void setPointLists(List<Point> pointLists) {
		this.pointLists = pointLists;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Triangle(){
		
	}
	
	public Triangle(String type){
		this.type = type;
	}

	public String getType() {
		return type;
	}
	
	public void draw(){
		System.out.println(getType() + " Triangle drawn");
		for(Point point : getPointLists())
		System.out.println("Point = (" + point.getX() + "," + point.getY() + ")");
	}

}
