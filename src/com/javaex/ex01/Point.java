package com.javaex.ex01;

public class Point {
	private int x;
	private int y;
	
	public Point() {}
	public Point(int x, int y) {
		this.x=x;
		this.y=y;
	}
	@Override
	public boolean equals(Object obj) {
		Point p=((Point)obj);//Object의 b가 가장 작으므로 확장 시켜줌
		if(this.x==p.x&&this.y==p.y) {//a의 x==this.x
			return true;
			
		}else {
			return false;
			
		}//이 내용이 없으면 false로 나온다. 다른 점이기 때문
		
	}
	
	
}
