package showGrade;

import javax.swing.JOptionPane;

public class ShowGrade {
	private int  n;
	private int score[];
	public ShowGrade(int n) {
		this.n=n;
		score=new int[n];
	}
	/**
	 * 输入学生的成绩
	 */
	public void initTalScore() {
		for(int i=0;i<score.length;i++) {
			String intString=JOptionPane.showInputDialog(null,"请输入第"+(i+1)+"个学生的成绩","显示学生成绩演示",JOptionPane.QUESTION_MESSAGE);
			score[i]=Integer.parseInt(intString);
		}
	}
	/**
	 * 展示学生的成绩
	 */
	public  void showScore() {
		System.out.println("下面显示这10位同学的成绩分别是");
		for(int  i=0;i<score.length;i++) {
			System.out.print(score[i]+" ");
		}
	}
}
