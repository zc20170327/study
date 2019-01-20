package ageTest;

import javax.swing.JOptionPane;

public class Age {
	/**
	 * 获取用户的输入值
	 * @return
	 */
	public  int input() {
		String intString=JOptionPane.showInputDialog(null,"请输入用户的年龄","判断用户的年龄称谓演示",JOptionPane.QUESTION_MESSAGE);
		int age=Integer.parseInt(intString);
		age=age/10;
		return age;
	}
	/**
	 * 判断用户的年龄称谓
	 * @param age
	 */
	public void ageTest(int age) {
		switch(age) {
		case 0:
		System.out.println("你的年龄在古时候的属于0-9岁~黄口");
		break;
		case 1:
			System.out.println("你的年龄在古时候的属于10-19岁~舞象之年");
			break;
		case 2:
			System.out.println("你的年龄在古时候的属于20-29岁~弱冠");
			break;
		case 3:
			System.out.println("你的年龄在古时候的属于30-39岁~而立之年");
			break;
		case 4:
			System.out.println("你的年龄在古时候的属于40-49岁~不惑之年");
			break;
		case 5:
			System.out.println("你的年龄在古时候的属于50-59岁~年逾半百");
			break;
		case 6:
			System.out.println("你的年龄在古时候的属于60-69岁~花甲");
			break;
		case 7:
			System.out.println("你的年龄在古时候的属于70-79岁~古稀");
			break;
		case 8:
			System.out.println("你的年龄在古时候的属于80-89岁~耄耋之年");
			break;
		case 9:
			System.out.println("你的年龄在古时候的属于90-99岁~人瑞");
			break;
		default:
			System.out.println("输入的年龄不再统计范围之内");
		}
	}
}
