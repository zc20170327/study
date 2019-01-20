package test;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
		List list=new ArrayList<>();
		System.out.println("商品列表是否为空"+list.isEmpty());
		list.add("苹果");
		System.out.println("商品列表是否为空"+list.isEmpty());
		System.out.println("商品列表现有的物品为"+list);
		list.add("荔枝");
		list.add("荔枝");
		list.add("荔枝");
		list.add("荔枝");
		System.out.println("继续添加物品后，商品列表现有商品"+list);
		list.add(1, "香蕉");
		System.out.println("指定位置添加商品后，商品列表的物品"+list);
		System.out.println("商品列表是否包含香蕉"+list.contains("香蕉"));
		System.out.println("商品下标为0的元素"+list.get(0));
		System.out.println("商品列表荔枝的下标为"+list.indexOf("荔枝"));
		list.remove(0);
		System.out.println("移除下标为0的元素后，商品列表现有的商品为:"+list);
		System.out.println("商品列表中现有物品的件数为"+list.size());
		list.clear();
		System.out.println("清空商品列表，商品列表是否为空"+list.isEmpty());

	}

}
