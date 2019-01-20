package test;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest {

	public static void main(String[] args) {
		Set set=new HashSet<>();
		String song1="我的未来不是梦";
		String song2="青春无悔";
		System.out.println("是否为空"+set.isEmpty());
		set.add(song1);
		set.add(song2);
		System.out.println("调用add()方法后，歌曲列表为:"+set);
		set.add(song1);
		System.out.println("添加我的未来不是梦是否成功"+set);
		System.out.println("歌曲列表中是否包含我的未来不是梦"+set.contains(song1));
		set.remove(song1);
		System.out.println("移除我的未来不是梦后的列表信息"+set);
		System.out.println("歌曲列表中现有的歌曲的首数"+set.size());

	}

}
