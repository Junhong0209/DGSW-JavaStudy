package kr.hs.dgsw.java.c2.tr1;

import java.util.Scanner;

public class rockPaperScissors {
	java.util.Random random = new java.util.Random();
	
	private Scanner scanner;
	
	private static String humanHand;
	private static String computerHand;
	
	
	public rockPaperScissors() {
		scanner = new Scanner(System.in);
	}
	
	public void closeScanner() {
		scanner.close();
	}
	
	public void inputComputerHand() {
		int value = random.nextInt(2);
		
		if (value == 0) {
			computerHand = "가위";
		}
		else if (value == 1) {
			computerHand = "바위";
		}
		else {
			computerHand = "보";
		}
	}
	
	public String getHumanHand() {
		return humanHand;
	}
	
	public void setHumanHand(String humanHand) {
		this.humanHand = humanHand;
	}
	
	public void inputHumanHand() {
		System.out.println("가위, 바위, 보 중 하나를 입력하세요:");
		
		setHumanHand(scanner.nextLine());
		
		closeScanner();
	}
	
	public void comparison() {
		if (humanHand == computerHand) {
			System.out.println("무승부네요.");
		}
		else if (humanHand == "보" && computerHand == "가위" || humanHand == "가위" && computerHand == "바위" || humanHand == "바위" && computerHand == "보") {
			System.out.println("제가 이겼네요.");
		}
		else if (humanHand == "바위" && computerHand == "가위" || humanHand == "보" && computerHand == "바위" || humanHand == "가위" && computerHand == "보") {
			System.out.println("당신이 이기셨네요.");
		}		
	}
	
	public static void main(String[] args) {
		rockPaperScissors rockPaperScissors = new rockPaperScissors();
		
		rockPaperScissors.inputComputerHand();
		rockPaperScissors.inputHumanHand();
//		System.out.println(computerHand);
//		System.out.println(humanHand);
		rockPaperScissors.comparison();
	}
}
