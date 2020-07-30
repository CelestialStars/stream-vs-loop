package com.differ;

import java.util.IntSummaryStatistics;
import java.util.List;

public class Integers {
    private final List<Integer> integers;

    public Integers(List<Integer> integers) {
        this.integers = integers;
    }

    protected int getMaxStream() {
        return integers.stream().max(Integer::compareTo).get();
    }

    protected int getMaxLoop() {
        int maxNumber = integers.get(0);
        for (Integer number : integers) {
            if (number > maxNumber) {
                maxNumber = number;
            }
        }
        return maxNumber;
    }

    protected int getMinStream() {
        return integers.stream().min(Integer::compareTo).get();
    }

    protected int getMinLoop() {
        int minNumber = integers.get(0);
        for (Integer number : integers) {
            if (number < minNumber) {
                minNumber = number;
            }
        }
        return minNumber;
    }

    protected int getSumStream() {
        return this.integers.stream().mapToInt(i -> i).sum();
    }

    protected int getSumLoop() {
        int sum = 0;
        for (Integer number : integers) sum = sum + number;
        return sum;
    }

    protected int getAverageStream() {
        return getSumStream() / integers.size();
    }

    protected int getAverageLoop() {
        return getSumLoop() / integers.size();
    }

    protected void getMaxMinSumAverageStream() {
        IntSummaryStatistics stats = integers.stream().mapToInt(x -> x).summaryStatistics();
        System.out.println(stats.getMax());
        System.out.println(stats.getMin());
        System.out.println(stats.getSum());
        System.out.println(stats.getAverage());
    }

}