package cn.ncu.retest;

import java.util.ArrayList;
import java.util.List;

public class Test {
	@org.junit.Test
	public void test() {
		/*long[] test = { 3, 2, 4, 7, 1, 6 };
		Arrays.sort(test);
		ArrayUtils.reverse(test);
		for (long l : test) {
			System.out.println(l);
		}*/
		List<Object> list = new ArrayList<Object>();
		list.add(null);
		list.add(123);
		System.out.println(list.get(0));
	}
}
