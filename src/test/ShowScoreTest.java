package test;

import showScore.ShowScore;

public class ShowScoreTest {

	public static void main(String[] args) {
		ShowScore score=new ShowScore(5, 2);
		score.inital();
		score.show();
		score.stuAverage();
		score.CourseAverage();
	}
}
