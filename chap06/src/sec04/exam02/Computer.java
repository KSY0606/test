package sec04.exam02;

public class Computer {
	//Field
	//Constructor
	//Method
	int sum1(int[] values) {
		int sum = 0; // sum������ 0���� �ʱ�ȭ
	for(int i=0; i<values.length; i++) {
		sum += values[i]; // ����� ���� sum�� ����������Ѵ�
	}
	return sum; // sum�� ���ϰ����� ����
	}
	
	// ���� ������� �Ű����� �޾� ��� ���ѵ� ������� �����ϴ� �޼ҵ� ����
	int sum2(int ... values) {
		int sum = 0; 
		for(int i=0; i<values.length; i++) {
			sum += values[i]; 
		}
		return sum; 
	}
}