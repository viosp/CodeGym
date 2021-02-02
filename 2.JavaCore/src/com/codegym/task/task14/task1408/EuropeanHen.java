package com.codegym.task.task14.task1408;

public class EuropeanHen extends Hen {
    @Override
    int getMonthlyEggCount() {
        return 7;
    }

    @Override
    String getDescription() {
        return super.getDescription() + String.format(" I come from %s. I lay %d eggs a month.", Continent.EUROPE, getMonthlyEggCount());
    }
}
