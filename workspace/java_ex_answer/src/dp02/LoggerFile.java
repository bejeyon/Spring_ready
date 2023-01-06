package dp02;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class LoggerFile implements LoggerInterface {

	@Override
	public void writeLog(String log) throws Exception {
		// TODO Auto-generated method stub
    	try {
    		Path path = Paths.get("./log.txt"); // 프로젝트 루트에 파일 생성
    		if (!Files.exists(path)) Files.createFile(path);
    		
    		byte[] data = (log + System.lineSeparator()).getBytes();
    		
			Files.write(path, data, StandardOpenOption.APPEND);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
