package com.example.demo;

public class BaseballCoach implements Coach{

   private FortuneService fortuneService;

    public BaseballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public BaseballCoach() {
    }

    @Override
    public String getDailyFortune() {

        return fortuneService.getFortune();
    }

    @Override
    public String getDailyWorkout(){
        return "Spend 30 minutes on batting practice";
    }
}
