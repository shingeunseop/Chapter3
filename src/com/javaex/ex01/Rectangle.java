package com.javaex.ex01;

public class Rectangle {
	private int width;
	private int height;
	public Rectangle() {}
	
	
	public Rectangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}


	public boolean equals(Object obt) {
		Rectangle r=((Rectangle)obt);
		if((this.width)* (this.height)==r.width*r.height)
			return true;
		else
			return false;
	}
	
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}

}
