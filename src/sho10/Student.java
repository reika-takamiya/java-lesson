package sho10;

public class Student {
    String name;
    int[] score;

    public Student(String name, int score1, int score2, int score3) {
        this.score = new int[3];
        this.name = name;
        this.score[0] = score1;
        this.score[1] = score2;
        this.score[2] = score3;
    }

    @Override
    public String toString() {
        String result = "[" + name;
        for (int i = 0; i < score.length; i++) {
            result += "," + score[i];
        }
        result += "]";
        return result;
    }

    public int total() {
        int sum = 0;
        for (int i = 0; i < score.length; i++) {
            sum += score[i];
        }
        return sum;
    }
}

