package test;

import java.util.LinkedList;

public class LinkedListTest {
	public static void main(String[] args) {
		LinkedList cart=new LinkedList<>();
		cart.add("苹果");
		System.out.println("添加苹果后，商品列表现有的商品为:"+cart);
		cart.addFirst("香蕉");
		System.out.println("addFirst()方法后，商品列表现有的商品为:"+cart);
		cart.addLast("橘子");
		System.out.println("addLast()方法后，商品列表现有的商品为:"+cart);
		cart.add("梨子");
		System.out.println("add()方法后，商品列表现有的商品为:"+cart);
		System.out.println("商品列表中最前面的物品为"+cart.getFirst());
		System.out.println("商品列表中最后面的物品为"+cart.getLast());
		cart.removeFirst();
		System.out.println("删除最前面的物品后，商品列表现有的物品为"+cart);
		cart.removeLast();
		System.out.println("删除最后面的物品后，商品列表现有的物品为"+cart);	
	}
}
