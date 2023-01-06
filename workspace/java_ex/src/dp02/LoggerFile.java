package dp02;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

// 파일 입출력할 때 복붙하기.
public class LoggerFile implements LoggerInterface {

	@Override
	public void writeLog(String log) throws Exception {
		// TODO Auto-generated method stub
		try {
			Path path = Paths.get("./log.txt");	// 프로젝트 루트에 파일 생성
			if (!Files.exists(path)) Files.createFile(path);	// 없으면 생성해줘.
			
			byte[] data = (log + System.lineSeparator()).getBytes();
			
			Files.write(path, data, StandardOpenOption.APPEND);	// 기존 파일 뒤에 붙여넣어라.
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
