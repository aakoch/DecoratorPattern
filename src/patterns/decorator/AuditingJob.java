package patterns.decorator;

public class AuditingJob implements Job {

    private Job job;
    
    public AuditingJob(Job job) {
        this.job = job;
    }
    
    @Override
    public void run() {
        System.out.println("Writing to DB...");
        job.run();
        System.out.println("Writing to DB again...");
    }

}
