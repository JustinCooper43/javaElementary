package com.streltsov.javaElementary.course.homeworks.hw29.shop;

import java.time.LocalTime;

public class WorkingHours {
    private final LocalTime startWorkTime;
    private final LocalTime finishWorkTime;
    private  LocalTime startBreakTime;
    private  LocalTime finishBreakTime;


    public WorkingHours(LocalTime startWorkTime, LocalTime finishWorkTime, LocalTime startBreakTime, LocalTime finishBreakTime) {
        this.startWorkTime = startWorkTime;
        this.finishWorkTime = finishWorkTime;
        this.startBreakTime = startBreakTime;
        this.finishBreakTime = finishBreakTime;
    }

    public WorkingHours(LocalTime startWorkTime, LocalTime finishWorkTime) {
        this.startWorkTime = startWorkTime;
        this.finishWorkTime = finishWorkTime;
    }

    public LocalTime getStartWorkTime() {
        return startWorkTime;
    }

    public LocalTime getFinishWorkTime() {
        return finishWorkTime;
    }

    public LocalTime getStartBreakTime() {
        return startBreakTime;
    }

    public LocalTime getFinishBreakTime() {
        return finishBreakTime;
    }
}
