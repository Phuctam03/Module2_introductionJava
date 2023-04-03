package lopvadoituong;

import java.util.Date;

public class Stopwatch {
    private Date startTime;
    private Date endTime;

    public Stopwatch() {

    }

    public Stopwatch(Date startTime, Date endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Date start() {
        this.startTime = new Date();
        return this.startTime;
    }

    public Date sTop() {
        this.endTime = new Date();
        return this.endTime;
    }

    public long getElapsedTime() {
        return this.sTop().getTime() - this.getStartTime().getTime();
    }

    public double[] sortArray() {
        double a[] = new double[100000];
        for (int i = 0; i < a.length; i++) {
            a[i] = Math.random();
        }
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    Double temp = a[i];
                    a[i] = a[j];
                    a[j] = a[i];
                }
            }
        }
        return a;
    }

    public static void main(String[] args) {
        Stopwatch watch = new Stopwatch();
        watch.start();
        double arr[] = watch.sortArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "");
        }
        watch.sTop();
        System.out.println("Time of milisecond :" + watch.getElapsedTime());

    }
}
