package com.Exadel;

public class ListClass  {
    int weight = 2;
    public static void main(String[] args) {
        new ListClass().go(8);
    }
    void go(int speed) {
        ++speed;
        weight++;
        int walkrate = speed * weight;
        System.out.print(walkrate + getGait());
    }
    String getGait() {
        return " mph, lope";
    }
}

