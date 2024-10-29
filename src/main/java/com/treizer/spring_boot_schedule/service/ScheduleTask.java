package com.treizer.spring_boot_schedule.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/*
 * - fixedRate: Ejecuta a intervalos fijos desde el inicio de cada ejecución.
 * - fixedDelay: Ejecuta a intervalos fijos desde el final de cada ejecución.
 * - initialDelay: Retrasa la primera ejecución.
 * - cron: Ejecuta según una expresión CRON. 6 fields. 
 * seconds, minutes, hours, day of the month, month, day of the week
 * - zone: Especifíca la zona horaria para una expresión CRON.
 */

@Component
public class ScheduleTask {

    // @Scheduled(fixedDelay = 5000, initialDelay = 5000)
    // Always used 6 fields
    @Scheduled(cron = "*/10 * * * * *", zone = "America/Mexico_City")
    public void scheludeMessage() {
        System.out.println("Hola Mundo!!");
        // Thread.sleep(7000);
    }

    // To know the timezone of each country
    // America/Mexico_City
    // public static void main(String[] args) {
    // ZoneId.getAvailableZoneIds().forEach(System.out::println);
    // }

}
