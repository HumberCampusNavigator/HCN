package com.example.wfg.presentation;

import android.support.annotation.NonNull;

import java.util.Comparator;

public class sensorReadings implements   Comparable<sensorReadings>{

    public String readingTime;
    public String readingValue;

    public sensorReadings() {

    }

    public sensorReadings(String readingTime, String readingValue) {
        this.readingTime = readingTime;
        this.readingValue = readingValue;
    }

    public String getReadingTime() {
        return readingTime;
    }

    public void setReadingTime(String readingTime) {
        this.readingTime = readingTime;
    }

    public String getReadingValue() {
        return readingValue;
    }

    public void setReadingValue(String readingValue) {
        this.readingValue = readingValue;
    }


    @Override
    public String toString() {
        return "Time: " + getReadingTime() + " Value: " +getReadingValue();
    }

    @Override
    public int compareTo(@NonNull sensorReadings o) {
        if( this.getReadingTime().compareTo(o.getReadingTime())<0){
            return 1;
        } else if (this.getReadingTime().compareTo(o.getReadingTime()) > 0) {
            return -1;
        }
        else{
            return this.getReadingTime().compareTo(o.getReadingTime());
        }
    }
}
