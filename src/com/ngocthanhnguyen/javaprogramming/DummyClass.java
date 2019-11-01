package com.ngocthanhnguyen.javaprogramming;

public class DummyClass {

    public String isVacationTime(boolean _vacationTime) {

        return _vacationTime ? "I'm on vacation" : "I'm working";

    }

    public void printNumbers(int[] _numbers) {
        for (int _number : _numbers) {
            System.out.println(_number);
        }
    }

    public void printNumbers() {

        int[] _numbers = new int[5];

        for (int _number : _numbers) {
            System.out.println(_number);
        }
    }

}
