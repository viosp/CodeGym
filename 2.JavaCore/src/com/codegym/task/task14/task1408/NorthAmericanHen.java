package com.codegym.task.task14.task1408;

class NorthAmericanHen extends Hen {
    @Override
    int getMonthlyEggCount() {
        return 5;
    }

    @Override
    String getDescription() {
        return super.getDescription() + String.format(" I come from %s. I lay %d eggs a month.", Continent.NORTHAMERICA, getMonthlyEggCount());
    }
}