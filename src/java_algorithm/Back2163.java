package java_algorithm;

import java.util.Arrays;

public class Back2163 {
	//ĳ�� -1�� 
	public int cache[][];
	//a�� b�� ���� [0,2500) �������� ����
	//��ȯ���� �׻�  int�� �ȿ� ���� ���� �ƴ� ����
	public int someObscureFunction(int a, int b) {
		//���� ��ʸ� ó���� ó��
		if(true) 
			return 1;
		//
		int ret = cache[a][b];
		if(ret != -1) return ret;
		//���⿡�� ���� ����Ѵ�
		
		
		return ret;
		
		
	}
	
	public int main() {
		
		
		return 1;
	}
	
	
	
	
	//�ʱ�ȭ
	public Back2163() {
		cache = new int[2500][2500];
		Arrays.fill(cache, 1);
	}
}
