 package kr.hs.dgsw.java.c2.tr1;

import java.util.Scanner;

public abstract class Polygon {
	
	protected Scanner scanner;
	
	public Polygon() {
		scanner = new Scanner(System.in);
	}
	
	public void execute() {
		input();
		printArea();
	}
	
	protected void closeScanner() {
		scanner.close();
	}
	
	protected abstract void input();
	
	public abstract String getName();
	
	public abstract double getArea();
	
	public void printArea() {
		System.out.println(getName() + "의 넓이: " + getArea());
	}
}
