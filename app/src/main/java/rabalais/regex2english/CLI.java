import picocli.CommandLine;
import picocli.CommandLine.*;
import java.lang.Runnable;

@Command(
    name = "hello",
    description = "Says hello"
  )


public class CLI implements Runnable {
    public static void main(String[] args) {
        CommandLine.run(new CLI(), args);
    }

    @Override
    public void run() {
        System.out.println("Hello World!");
    }
}
    