package dp02;

import java.util.Scanner;

// data를 읽어오는 기능을 하는 class. sensor에서 넘어오는 data(전압)를 수집하는 class.
public class LoggerService {
	
	private LoggerInterface logger;	// 외부에서 접근 못 하게
	
	public LoggerService(LoggerInterface logger) {
		this.logger = logger;	// 이제 병렬 코딩 가능
	}
	
	public void start() throws Exception {
		System.out.println("전압을 입력해주세요.");	// 지금은 센서가 없어서 ㅠ
		
		Scanner scan = new Scanner(System.in);	// scanner의 생성자는 무엇을 통해 입력받을 것인지 지정하는 매개변수 필수.
		
		try {	// 입력하는 상황에서 입력 못 받는 예외상황 대비.
			while(true) {	// 무한루프
				String v = scan.next().toUpperCase();	// Scanner의 next()는 String 반환. 왜 쓰지? 의문 갖지 말자... 사용법! '자바 입력받는 법'에 메모해놓고 복붙해서 씁시다. 이거는 절대로 이해하는 게 아님.
				
				if ("Q".equals(v)) {
					System.out.println("종료되었습니다.");
					break;
				}
				
				// System.out.println("입력 전압 : " + v);
				logger.writeLog(v);
			}
			
		} catch (Exception ex) {
			throw new Exception("입력 값에 문제가 있습니다.");	// custom message
		} finally {
			scan.close();	// Scanner를 열었으면 꼭 닫아야 함.
		}
	}
}
