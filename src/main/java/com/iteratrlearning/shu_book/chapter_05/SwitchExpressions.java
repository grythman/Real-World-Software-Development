package com.iteratrlearning.shu_book.chapter_05;

public class SwitchExpressions {

    public static void main(String[] args) {
        var dealStage = Stage.LEAD;
        var amount = 10;

        var forecastedAmount = 0.0;

        switch (dealStage) {
            case LEAD:
                forecastedAmount = amount * 0.2;
                break;
            case EVALUATING:
                forecastedAmount = amount * 0.5;
                break;
            case INTERESTED:
                forecastedAmount = amount * 0.8;
                break;
            case CLOSED:
                forecastedAmount = amount * 1;
                break;
        }

        System.out.println(forecastedAmount);

        System.out.println(forecastedAmount);
    }
}
