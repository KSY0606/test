package sec01.exam06;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class hashMapExample {
	public static void main(String[] arg) {
		
		Map<String, Integer> map = new HashMap<String, Integer>(); // Map �÷��� ����
		
		//��ü ����
		map.put("�ſ��", 85);
		map.put("ȫ�浿", 90);
		map.put("���屺", 80);
		map.put("ȫ�浿", 95); // "ȫ�浿"Ű�� ���⶧���� ���� �������� ������ ������ ��ü��
		System.out.println("�� Entry ��: " + map.size()); // ����� ��Entry �� ���
		
		//��ü ã��
		System.out.println("\tȫ�浿 : " + map.get("ȫ�浿"));
		System.out.println();
		
		//��ü�� �ϳ��� ó��
		Set<String> keySet = map.keySet(); // keySet ���
		Iterator<String> keyIterator = keySet.iterator();
		while(keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value = map.get(key);
			System.out.println("\t" + key + " : " + value);
		}
		System.out.println();
		
		//��ü ����
		map.remove("ȫ�浿");
		System.out.println("�� Entry ��: " + map.size());
		
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		
		while(entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("\t" + key + " : " + value);
		}
		System.out.println();
		//��ü ��ü ����
		map.clear();
		System.out.println("�� Entry ��: " + map.size());
		
	}
	
}
