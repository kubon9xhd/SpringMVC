
public class HelloWorld {
	  private String hello;
	    private String world;

	    /**
	     * Constructor
	     */
	    HelloWorld() {
	        hello = "Hello";
	        world = "World!";
	    }

	    /**
	     * forms the Hello World Message.
	     */
	    public String formMessage() {
	        String message;
	        message = hello + " " + world;
	        return message;
	    }

	    public static void main(String[] args) {
	        HelloWorld helloWorld = new HelloWorld();
	        System.out.println(helloWorld.formMessage());
	    }

}
