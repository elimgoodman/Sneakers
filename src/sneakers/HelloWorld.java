package sneakers;

public class HelloWorld {
    
    public static void main(String[] args) {
	JSEmitter emitter = new JSEmitter();
	System.out.println(emitter.getJS("a = 1;"));
    }
}
