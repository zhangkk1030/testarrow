package arrow_offer;

import java.lang.reflect.Field;

public class swap_Integer {
	/*
	private int value;
	public swap_Integer(int i) {
		this.value=i;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public static void swapMyInteger(swap_Integer x,swap_Integer y) {
		swap_Integer mid = new swap_Integer(x.getValue());
		x.setValue(y.getValue());
		y.setValue(mid.getValue());
	}
	*/
	public static void swap(Integer a,Integer b) {
		if(a==null && b==null) {
			return;
		}
		//获得a的class对象
		Class<Integer>integerClass = (Class<Integer>)a.getClass();
		try {
			//获得value属性
//getDeclaredField返回一个 Field 对象，该对象反映此 Class 对象所表示的类或接口的指定已声明字段（包括私有成员）
			Field value = integerClass.getDeclaredField("value");
			//设置权限为可访问
			value.setAccessible(true);
			//交换
			int temp=a;
			value.setInt(a, b);
			value.setInt(b, temp);
		}catch(NoSuchFieldException e){
//Class.getField(String name)和Class.getFields()都只能返回公有属性，如果访问私有属性就会报错java.lang.NoSuchFieldException
			e.printStackTrace();
		}catch(IllegalAccessException e){
			e.printStackTrace();
		}
	}
	/*	测试，用Integer类型定义，可以实现交换，用int就不行
	public static void main(String[] args) {
		Integer a =	3;
		Integer b =	4;
		swap(a,b);
		System.out.println(a);
	}
	*/
}
