import java.io.BufferedReader;
import java.io.PrintWriter;
import java.net.Socket;


public class FTPServer {
	protected Socket sk;
	protected BufferedReader in;
	protected PrintWriter out;
	
	// Creates the FTP server with the a Socket, BufferedReader, and PrintWriter
	public FTPServer(Socket sk, BufferedReader in, PrintWriter out){
		/*Fix these later*/
		this.sk = sk;
		this.in = in;
		this.out = out;
	}
}
