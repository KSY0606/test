package sec02.exam01;

public class PromotionExample {

	public static void main(String[] args) {
		
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		A a1 = b;		// AŸ���� ��ӹް� �ֱ⶧���� �ڵ�Ÿ�Ժ�ȯ�� �Ǹ鼭 ������ ��������	
		A a2 = c;
		A a3 = d;
		A a4 = e;

		B b1 = d;
		C c1 = e;
		
		// B b2 = e; ��ӵǾ������ʱ� ������ ������ �����߻� 
		// C c2 = d;
	}

}