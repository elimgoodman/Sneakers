package sneakers;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;

public class HelloWorld {
    
    static String readFile(String path) throws IOException {
	Charset encoding  = Charset.defaultCharset();
	byte[] encoded = Files.readAllBytes(Paths.get(path));
	return encoding.decode(ByteBuffer.wrap(encoded)).toString();
    } 
    
    public static void main(String[] args) throws IOException {
	String fileString = readFile("syntax.txt");
	JSEmitter emitter = new JSEmitter();
	System.out.println(emitter.getJS(fileString, true));
    }
}
