import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.Socket;


public class FTPLog {
	
	protected File file;

	// Setting up the FTPLog class
	public FTPLog(File file){
		this.file = file;
	}
	
	// Formats the sent/received commands that will be sent to the log file
	public String logFormat(String s, Socket sk){
		String formatLog = "(Date and Time)" + s + " from " + sk.getInetAddress();
		return formatLog;
	}
	
	// Sends the sent/received commands to the log file
	public void logSend(String s, FileWriter fw){
		try {
			fw.write(s);
			fw.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
