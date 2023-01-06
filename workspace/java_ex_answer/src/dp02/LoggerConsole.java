package dp02;

public class LoggerConsole implements LoggerInterface {

	@Override
	public void writeLog(String log) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("입력 전압: " + log);
	}

}
