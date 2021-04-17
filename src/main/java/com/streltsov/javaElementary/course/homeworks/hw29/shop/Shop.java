package com.streltsov.javaElementary.course.homeworks.hw29.shop;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Collection;

public class Shop {
    WorkingHours workingHours;
    ScheduleException exceptionalScheduleOfWork;
    WorkingHours workingHoursForExceptionalDay;
    boolean willBeWorkInHoliday;

    public Shop(WorkingHours workingHours, ScheduleException exceptionalScheduleOfWork, boolean willBeWorkInHoliday) {
        this.workingHours = workingHours;
        this.exceptionalScheduleOfWork = exceptionalScheduleOfWork;
        this.willBeWorkInHoliday = willBeWorkInHoliday;
        this.workingHoursForExceptionalDay = getExceptionWorkingHours(exceptionalScheduleOfWork);
    }

    private WorkingHours getExceptionWorkingHours(ScheduleException exceptionalWorkingHours) {
        WorkingHours result = null;
        if(exceptionalWorkingHours != null) {
            Collection<WorkingHours> workingHoursCollection = exceptionalWorkingHours.mapScheduleException.values();
            for (WorkingHours var : workingHoursCollection) {
                result = var;
            }
        }
        return result;
    }

    private DayOfWeek getExceptionDayOfWeek(ScheduleException exceptionalWorkingHours){
        DayOfWeek result = null;
        if(exceptionalWorkingHours != null) {
            Collection<DayOfWeek> dayOfWeekCollection = exceptionalWorkingHours.mapScheduleException.keySet();
            for (DayOfWeek var : dayOfWeekCollection) {
                result = var;
            }
        }
        return  result;
    }

    public boolean doShopping(LocalDateTime shoppingTime){
        DayOfWeek dayOfWeekAsk = shoppingTime.getDayOfWeek();
        DayOfWeek dayOfWeekException = getExceptionDayOfWeek(exceptionalScheduleOfWork);

        if (dayOfWeekAsk.equals(dayOfWeekException) & workingHoursForExceptionalDay == null) {
            return false;
        }

        if (!willBeWorkInHoliday) {
            return false;
        }else if (exceptionalScheduleOfWork == null) {
            return checkWorkDay(shoppingTime,workingHours);
        }else if (dayOfWeekAsk.equals(dayOfWeekException)){
            return checkWorkDay(shoppingTime, workingHoursForExceptionalDay);
        }else {
            return checkWorkDay(shoppingTime,workingHours);
        }
    }

    private boolean checkWorkDay(LocalDateTime shoppingTime, WorkingHours workingHoursForHoliday) {

        if (workingHoursForHoliday.getStartBreakTime() == null) {
            return checkWorkHours(shoppingTime, workingHoursForHoliday);
        }
        boolean compareTimeAskTimeWork = checkWorkHours(shoppingTime, workingHoursForHoliday);
        boolean compareTimeAskTimeBreak = checkBreakHours(shoppingTime, workingHoursForHoliday);
        return compareTimeAskTimeBreak & compareTimeAskTimeWork;
    }

    private LocalTime getTimeFromShoppingTime(LocalDateTime shoppingTime) {
        int hourAsk = shoppingTime.getHour();
        int minuteAsk = shoppingTime.getMinute();
        return LocalTime.of(hourAsk, minuteAsk);
    }

    private boolean checkWorkHours(LocalDateTime shoppingTime, WorkingHours scheduleWork) {
        LocalTime timeAsk = getTimeFromShoppingTime(shoppingTime);
        LocalTime startShopWork = scheduleWork.getStartWorkTime();
        LocalTime finishShopWork = scheduleWork.getFinishWorkTime();

        if (timeAsk.equals(startShopWork) |
                timeAsk.equals(finishShopWork)) {
            return true;
        }
        return timeAsk.isAfter(startShopWork) & timeAsk.isBefore(finishShopWork);
    }

    private boolean checkBreakHours(LocalDateTime shoppingTime, WorkingHours scheduleWork) {
        LocalTime timeAsk = getTimeFromShoppingTime(shoppingTime);
        LocalTime startBreak = scheduleWork.getStartBreakTime();
        LocalTime finishBreak = scheduleWork.getFinishBreakTime();

        if (timeAsk.equals(finishBreak)) {
            return true;
        }
        return timeAsk.isAfter(finishBreak) | timeAsk.isBefore(startBreak);
    }
}
