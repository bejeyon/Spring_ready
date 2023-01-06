package dp02;

public class LoggerApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoggerService svc = new LoggerService(new LoggerConsole());
		
		try {
			svc.start();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
