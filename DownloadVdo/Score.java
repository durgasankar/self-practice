package DownloadVdo;

public class Score {

	public static void main(String[] args) {
		
		//Score.calculateScore(true, 1500, 100, 5);
		int highScorePosition = calculateHighScore(1500);
		highScorePosition("Raja",highScorePosition );
		
		highScorePosition = calculateHighScore(900);
		highScorePosition("Ram",highScorePosition );
		
		highScorePosition = calculateHighScore(50);
		highScorePosition("Rajesh",highScorePosition );
		
		highScorePosition = calculateHighScore(400);
		highScorePosition("Rakesh",highScorePosition );
		
	}
	public static void calculateScore(boolean gameOver,int score,int bonus,int levelCompleted) {
		gameOver = true;
		if(gameOver) {
			int finalScore = score + (levelCompleted*bonus);
			finalScore += 1000;
			System.out.println("Your final score is : "+finalScore);
		}
	}
	
	public static void highScorePosition(String name , int highScorePosition) {
		System.out.println(name+" managed to get into position "+highScorePosition+" on high score table.");
		
	}
	
	public static int calculateHighScore(int pscore) {
		if (pscore>=1000) {
			return 1;
		}else if(pscore>=500 && pscore<1000) {
			return 2;
		}else if(pscore>=100 && pscore<500) {
			return 3;
		}
		return 4;	
	}
}
//we can also write to reduce the complexity of the code 
		/*if (pscore>=1000) {
			return 1;
		}else if(pscore>=500) {
			return 2;
		}else if(pscore>=100) {
			return 3;
		}
		return 4;*/