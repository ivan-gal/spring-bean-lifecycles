package com.example.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemo {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        CricketCoach theCricketCoach = context.getBean("myCricketCoach", CricketCoach.class);

        System.out.println(theCricketCoach.getDailyWorkout());
        System.out.println(theCricketCoach.getDailyFortune());
        System.out.println(theCricketCoach.getTeam());
        System.out.println(theCricketCoach.getEmailAddress());
        context.close();

    }
}
