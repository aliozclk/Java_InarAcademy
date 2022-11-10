package chapters.chapter9.exercise09_06;

public class StopWatch {
    private long startTime;
    private long endTime;

    StopWatch(){
        startTime = System.nanoTime();
    }

    long getStartTime() {
        return startTime;
    }

    long getEndTime() {
        return endTime;
    }

    void start(){
        startTime = System.nanoTime();
    }

    void stop(){
        endTime = System.nanoTime();
    }

    long getElapsedTime(){
        return endTime - startTime ;
    }
}
