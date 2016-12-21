package com.qk18.test;

public class Square71 extends Rectangle71 {
		public double side;
		public Square71(){
			
		}
		
		public Square71(double side){
			this.side=side;
		}
		
		public Square71(double side,String color,boolean filled){
			this.side=side;
			this.color=color;
			this.filled=filled;
		}

		public double getSide() {
			return side;
		}

		public void setSide(double side) {
			this.side = side;
		}
		
		public void setWidth(double side){
			
		}

		public void  setLenght(double side){
			
		}
		
		public String toString(){
			return ("正方形的面积：");
		}
	}
