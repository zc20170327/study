package oddNumber;

import javax.swing.JOptionPane;

public class Num {
	/**
	 * 获取输入的值
	 * @return
	 */
	public int inPut() {
		String intStr=JOptionPane.showInputDialog(null, "请输入一个整数","判断奇偶数演示",JOptionPane.QUESTION_MESSAGE);
		int num=Integer.parseInt(intStr);
		return num;
	}
	/**
	 * 判断奇偶性
	 */
	public void jurdge(int a) {
		if(a%2==0) {
			System.out.println(a+"是偶数");
		}else {
			System.out.println(a+"是奇数");
		}
	}
}
