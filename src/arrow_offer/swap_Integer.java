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
		//���a��class����
		Class<Integer>integerClass = (Class<Integer>)a.getClass();
		try {
			//���value����
//getDeclaredField����һ�� Field ���󣬸ö���ӳ�� Class ��������ʾ�����ӿڵ�ָ���������ֶΣ�����˽�г�Ա��
			Field value = integerClass.getDeclaredField("value");
			//����Ȩ��Ϊ�ɷ���
			value.setAccessible(true);
			//����
			int temp=a;
			value.setInt(a, b);
			value.setInt(b, temp);
		}catch(NoSuchFieldException e){
//Class.getField(String name)��Class.getFields()��ֻ�ܷ��ع������ԣ��������˽�����Ծͻᱨ��java.lang.NoSuchFieldException
			e.printStackTrace();
		}catch(IllegalAccessException e){
			e.printStackTrace();
		}
	}
	/*	���ԣ���Integer���Ͷ��壬����ʵ�ֽ�������int�Ͳ���
	public static void main(String[] args) {
		Integer a =	3;
		Integer b =	4;
		swap(a,b);
		System.out.println(a);
	}
	*/
}
