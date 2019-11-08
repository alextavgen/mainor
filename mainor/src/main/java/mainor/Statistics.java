package mainor;

public class Statistics {
    private int sum;
    private int counter;
    private int min;
    private int max;

    public Statistics(){
        sum = 0;
        counter = 0;
        max = Integer.MIN_VALUE;
        min = Integer.MAX_VALUE;
    }

    public void add(int number){
        sum = sum + number;
        counter++;

        if (number < min){
            min = number;
        }
        if (number > max){
            max = number;
        }
    }

    public int getMin(){
        return min;
    }

    public int getMax(){
        return max;
    }

    public float getAvg(){
        return sum/counter;
    }
}
