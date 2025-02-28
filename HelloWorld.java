public class Greeting {
    // Method that returns the greeting message
    public String getGreeting() {
        return "Hello, World!";
    }

    public static void main(String[] args) {
        // Create an instance of the Greeting class
        Greeting greet = new Greeting();
        
        // Call the method to get the greeting and print it
        System.out.println(greet.getGreeting());
    }
}
