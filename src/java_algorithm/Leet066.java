package java_algorithm;

public class Leet066 {
	public int[] plusOne(int[] digits) {
		
		//ù�ڸ� ���� �������
		String st = new String();
		for(int i = 0 ; i < digits.length ; i++) {
			st += String.valueOf(digits[i]);
		}
		
		//���ڸ� ���ڷ� �ٲپ���
		int converted = 0;
		converted = Integer.parseInt(st);

		//1�� ������
		converted+=1;
		
		for(int i = 0 ; i < digits.length ; i++) {
			digits[i] = st.charAt(i);
			System.out.print(digits[i]);
		}
		
		return digits;
    }

}
