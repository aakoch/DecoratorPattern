package patterns.decorator;

public class Main {
    
    public static void main(String[] args) {
        Scheduler scheduler = new Scheduler();
        Job exampleJob = new AuditingJob(new LoggingJob(new ExampleJob()));
        scheduler.run(exampleJob);
    }
    
}
