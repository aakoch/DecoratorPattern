package patterns.decorator;
import java.util.Date;

public class LoggingJob implements Job {

    private Job job;
    
    public LoggingJob(Job job) {
        this.job = job;
    }
    
    @Override
    public void run() {
        System.out.println("Starting job " + job + " at " + new Date());
        job.run();
        System.out.println("Job " + job + " finished at " + new Date());
    }

}
