package ss4_lop_va_doi_tuong_trong_java.bai_tap;

import java.util.Scanner;

public class StopWatch {
    private long startTime ;
    private long endTime  ;
    public long getStartTime(){
        return  this.startTime ;
    }
    public long getEndTime(){
        return this.endTime;
    }
    public void  setStartTime( long startTime){
        this.startTime = startTime ;
    }
    public void  setEndTime( long endTime){
        this.endTime = endTime ;
    }
    public void start(){
        this.startTime = System.currentTimeMillis() ;
    }
    public void stop(){
        this.endTime = System.currentTimeMillis() ;
    }
    public long getElapsedTime(){
        return this.endTime  -  this.startTime;
    }
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        System.out.println(stopWatch.getStartTime());
        for (int i = 0 ; i < 1000; i++){
            stopWatch.stop();
            System.out.println(stopWatch.getEndTime());

        }
        System.out.println(stopWatch.getElapsedTime());
    }
}
