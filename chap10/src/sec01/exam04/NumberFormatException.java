package sec01.exam04;

public class NumberFormatException {

	public static void main(String[] args) {
		
		String data1 = "100";
		String data2 = "a100";
		
		int value1 = Integer.parseInt(data1);
		System.out.println(value1);
		
		int value2 = Integer.parseInt(data2); // a�� ���ڷ� ����� ���� ������ NumberFormatException�� �߻��Ѵ�

	}

}