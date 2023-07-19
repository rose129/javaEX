package com.javaex.javaoop;

// abstract -> 부모가 독단적으로 올라가면 안될 때 쓰는 코드
public abstract class Shape {
		// 필드
		protected String fillColor;
		protected String lineColor;
		
		// 생성
		public Shape() {}
		
		public Shape(String fillColor, String lineColor) {
			this.fillColor = fillColor;
			this.lineColor = lineColor;
		}
		
		// 메소드
		public String getFillColor() {
			return fillColor;
		}

		public void setFillColor(String fillColor) {
			this.fillColor = fillColor;
		}

		public String getLineColor() {
			return lineColor;
		}

		public void setLineColor(String lineColor) {
			this.lineColor = lineColor;
		}
		
		// 메소드 일반
		// draw --> 오버 라이딩
		
		public abstract void draw();
		public abstract double area();
		
		// test
		
		@Override
		public String toString() {
			return "Shape [fillColor =" + fillColor + ", lineColor = " + lineColor + "]";
		}
		
}
