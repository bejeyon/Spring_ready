package dp02;

import java.util.Scanner;

public class LoggerService {
	
	private LoggerInterface logger;
	
	public LoggerService(LoggerInterface logger) { 
		this.logger = logger;
	}
	
	public void start() throws Exception {
		System.out.println("전압을 입력해 주세요.");
		
		Scanner scan = new Scanner(System.in);
		
		try {
			while(true) {
				String v = scan.next().toUpperCase();
				
				if ("Q".equals(v)) {
					System.out.println("종료되었습니다.");
					break;
				}
				//System.out.println("입력 전압: " + v);
				logger.writeLog(v);
			}
			
		} catch (Exception ex) {
			throw new Exception("입력 값에 문제가 있습니다.");
		} finally {
			scan.close();
		}
	}
}
