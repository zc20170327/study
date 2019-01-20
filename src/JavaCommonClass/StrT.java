package JavaCommonClass;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StrT {
	private String str=" ";
	/**
	 * 获取用户输入信息
	 * @return
	 */
	public String inPut() {
		System.out.println("请输入内容:");
		BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
		try {
			str=bufferedReader.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return str;
	}
	/**
	 * 统计字符串空格的数量
	 * @param str
	 */
	public void NumberSpace(String str) {
		int  sum=0;
		for (int i=0;i<str.length();i++) {
			if(str.charAt(i)==' ') {
				sum++;
			}
		}
		System.out.println("空格的数为:"+sum);
	}
	/**
	 * 反转字符串
	 * @param str
	 */
	public void InverString(String str) {
		System.out.println("字符串反转后为:");
		for(int i=str.length()-1;i>-1;i--) {
			System.out.print(str.charAt(i));
		}
	}
}
