package com.practice.specific.streamcomparision;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Employee> empList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            empList.add(new Employee(i, "A", 50000.00));
        }

        Long seconds = 0L;
        LocalDateTime startTime = LocalDateTime.now();
        empList.stream().forEach(employee -> employee.toString());
        LocalDateTime endTime = LocalDateTime.now();
        seconds = ChronoUnit.MILLIS.between(startTime, endTime);
        System.out.println(String.format("Sequential Stream takes : %dms", seconds) );

        startTime = LocalDateTime.now();
        empList.stream().parallel().forEach(employee -> employee.toString());
        endTime = LocalDateTime.now();
        seconds = ChronoUnit.MILLIS.between(startTime, endTime);
        System.out.println(String.format("Parallel Stream takes : %dms", seconds) );
    }
}
