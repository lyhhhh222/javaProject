package variable;

public class PromotionExample {

	public static void main(String[] args) {
		// 자동 형변환
		byte byteValue = 10;
		int intValue = byteValue; //1byte -> 4byte byteValue의 리터럴이 대입되는 시점에 정수타입으로 확장
		
		char charValue = '가';
		intValue = charValue;
		
		intValue = 500;
		long longValue = intValue;
		
		double doubleValue = intValue;
		System.out.println(doubleValue);
	    //크키가 큰 실수를 정수변수에 저장할 경우 데이터 손실 발생 - 개발자가 결정해야 함(강제타입 변환 필요)	
		//intValue = doubleValue; //Type mismatch: cannot convert from
	}

}
