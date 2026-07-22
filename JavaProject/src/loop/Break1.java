package loop;

public class Break1 {

	public static void main(String[] args) {
		// 반복 진행 중 특정 조건 만족시 반복 종료
		int i=0;
		
		while(true) {//무한반복
			i+=3;
			if(i>100) {//100보다 크면
				break; //가장 가까운 반복문 종료
			}
			System.out.println(i);
		}
		
		//중첩반복에서의 break = break와 가장 가까운 반복문 종료
		for(char upper='A';upper<='Z';upper++) {
			for(char lower='a';lower<='z';lower++) {
				System.out.println(upper+"-"+lower);
				if(lower=='g') {
					break;
				}
			}
		}

	}

}
