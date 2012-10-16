package patterns.decorator;

public class ExampleJob implements Job {

    @Override
    public void run() {
        System.out.println("inside ExampleJob.run()");
    }

}
