package org.example;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class ClockPane extends Pane {
    private int hour;
    private int minute;
    private int second;

    public ClockPane() {
        setCurrentTime();
    }

    public ClockPane(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void setHour(int hour) {
        this.hour = hour;
        paintClock();
    }

    public void setMinute(int minute) {
        this.minute = minute;
        paintClock();
    }

    public void setSecond(int second) {
        this.second = second;
        paintClock();
    }

    public void setCurrentTime() {
        Calendar calendar = new GregorianCalendar();
        this.hour = calendar.get(Calendar.HOUR_OF_DAY);
        this.minute = calendar.get(Calendar.MINUTE);
        this.second = calendar.get(Calendar.SECOND);
        paintClock();
    }

    private void paintClock() {
        double clockRadius = Math.min(getWidth(), getHeight() * 0.8 * 0.5);
        double centerX = getWidth() / 2;
        double centerY = getHeight() / 2;
        Circle circle = new Circle(centerX, centerY, clockRadius);
        circle.setFill(Color.WHEAT);
        circle.setStroke(Color.BLACK);
        Text text1 = new Text(centerX - 5, centerY - clockRadius + 12, "12");
        Text text2 = new Text(centerX - clockRadius + 3, centerY + 5, "9");
        Text text3 = new Text(centerX + clockRadius - 10, centerY + 3, "3");
        Text text4 = new Text(centerX - 3, centerY + clockRadius - 3, "6");
        double sLenght = clockRadius * 0.8;
        double secondX = centerX + sLenght * Math.sin(second * (2 * Math.PI / 60));
        double secondY = centerY - sLenght * Math.cos(second * (2 * Math.PI / 60));
        Line SLine = new Line(centerX, centerY, secondX, secondY);
        SLine.setStroke(Color.RED);
        double mLenght = clockRadius * 0.65;
        double xMinute = centerX + mLenght * Math.sin(minute * (2 * Math.PI / 60));
        double minuterY = centerY - mLenght * Math.cos(minute * (2 * Math.PI / 60));
        Line mLine = new Line(centerX, centerY, xMinute, minuterY);
        mLine.setStroke(Color.BLUE);
        double hLength = clockRadius * 0.5;
        double hourX = centerX + hLength * Math.sin((hour % 12 + minute / 60.0) * (2 * Math.PI / 12));
        double hourY = centerY - hLength * Math.sin((hour % 12 + minute / 60.0) * (2 * Math.PI / 12));
        Line hLine = new Line(centerX, centerY, hourX, hourY);
        hLine.setStroke(Color.GREEN);
        getChildren().clear();
        getChildren().addAll(circle, text1, text2, text3, text4, SLine, mLine, hLine);
    }

    public void setWidth(double width) {
        super.setWidth(width);
        paintClock();
    }

    public void setHeight(double height) {
        super.setHeight(height);
        paintClock();
    }
}
