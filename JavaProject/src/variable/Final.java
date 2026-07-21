package variable;

public class Final {

	public static void main(String[] args) {
		// 상수 : final 예약어 사용
		final double PI = 3.14;
		double radius = 10;
		double circleArea = 0;
		
		circleArea = radius * radius * PI;
		radius = 20.0; //변수값 변경 가능
		//PI = 31.4;
		
		System.out.println("원의 면적="+circleArea);
		

	}

}
