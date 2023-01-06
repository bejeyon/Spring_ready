package dp02;

public class LoggerApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoggerService svc = new LoggerService(new LoggerFile());	// 자동주입, 인젝션.

		try {
			svc.start();
		} catch (Exception e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

}
