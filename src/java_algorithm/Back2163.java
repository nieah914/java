package java_algorithm;

import java.util.Arrays;

public class Back2163 {
	//캐시 -1로 
	public int cache[][];
	//a와 b는 각각 [0,2500) 구간안의 정수
	//반환값은 항상  int형 안에 들어가는 음이 아닌 정수
	public int someObscureFunction(int a, int b) {
		//기저 사례를 처음에 처리
		if(true) 
			return 1;
		//
		int ret = cache[a][b];
		if(ret != -1) return ret;
		//여기에서 답을 계산한다
		
		
		return ret;
		
		
	}
	
	public int main() {
		
		
		return 1;
	}
	
	
	
	
	//초기화
	public Back2163() {
		cache = new int[2500][2500];
		Arrays.fill(cache, 1);
	}
}
