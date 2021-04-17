package com.streltsov.javaElementary.course.homeworks.hw29.shop;

import java.time.DayOfWeek;
import java.util.Map;

public class ScheduleException {

    public Map<DayOfWeek,WorkingHours> mapScheduleException;

    public ScheduleException (Map<DayOfWeek,WorkingHours> mapScheduleException){
        this.mapScheduleException = mapScheduleException;

    }
}
