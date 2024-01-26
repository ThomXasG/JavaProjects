/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author Asus
 */
public class Clock {

    private static Clock instance;
    private static SimpleDateFormat formatHour = new SimpleDateFormat("HH:mm:ss");

    private Clock() {

    }

    public static Clock getInstance() {
        return instance == null ? instance = new Clock() : Clock.instance;
    }

    public void startClock() {
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                showHour();
            }
        }, 0, 1000);
    }

    private void showHour() {
        Date hour = new Date(System.currentTimeMillis());
        String hourForm = formatHour.format(hour);
        System.out.println(hourForm);
    }
}
