package linkedlist;

import java.time.Duration;
import java.time.LocalTime;

public class Job {
    String name;
    LocalTime arrivalTime;
    int completedTime;
    int burstCycle;

    public Job(String name, LocalTime arrivalTime, int completedTime, int burstCycle) {
        this.name = name;
        this.arrivalTime = arrivalTime;
        this.completedTime = completedTime;
        this.burstCycle = burstCycle;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalTime getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(LocalTime arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public int getCompletedTime() {
        return completedTime;
    }

    public void setCompletedTime(int completedTime) {
        this.completedTime = completedTime;
    }

    public int getBurstCycle() {
        return burstCycle;
    }

    public void setBurstCycle(int burstCycle) {
        this.burstCycle = burstCycle;
    }

    @Override
    public String toString() {
        return "LinkedList.Queue.Job{" +
                "name='" + name + '\'' +
                ", arrivalTime=" + arrivalTime +
                ", completedTime=" + completedTime +
                ", burstCycle=" + burstCycle +
                '}';
    }
}
