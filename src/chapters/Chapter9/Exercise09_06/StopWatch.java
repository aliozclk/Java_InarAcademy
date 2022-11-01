package chapters.Chapter9.Exercise09_06;

public class StopWatch {
    private long startTime;
    private long endTime;

    StopWatch(){
        startTime = System.nanoTime();
    }

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void start(){
        startTime = System.nanoTime();
    }

    public void stop(){
        endTime = System.nanoTime();
    }

    public long getElapsedTime(){
        return endTime - startTime ;
    }
}
