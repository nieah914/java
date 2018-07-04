package java_algorithm;

public class Leet066 {
	public int[] plusOne(int[] digits) {
		
		//첫자리 값을 집어넣음
		String st = new String();
		for(int i = 0 ; i < digits.length ; i++) {
			st += String.valueOf(digits[i]);
		}
		
		//문자를 숫자로 바꾸어줌
		int converted = 0;
		converted = Integer.parseInt(st);

		//1을 더해줌
		converted+=1;
		
		for(int i = 0 ; i < digits.length ; i++) {
			digits[i] = st.charAt(i);
			System.out.print(digits[i]);
		}
		
		return digits;
    }

}
