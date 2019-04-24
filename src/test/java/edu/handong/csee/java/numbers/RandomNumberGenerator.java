package edu.handong.csee.java.numbers;

public class RandomNumberGenerator{
    private int firstNumber;
    private int secondNumber;
    private int randomNumber;
    
    RandomNumberGenerator(int n1,int n2){
        firstNumber = n1;
        secondNumber = n2;
    }

	
    void generateRandomNumber(){
        randomNumber = (int)((Math.random() * (secondNumber - firstNumber + 1)) + firstNumber);
    }
    int getRandomNumber(){
        return randomNumber;
    }

    public static void main(String[] args) {
        int result;
        RandomNumberGenerator rng = new RandomNumberGenerator(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
        rng.generateRandomNumber();
        result = rng.getRandomNumber();
        System.out.println(result);
        System.out.println("⇒ Any number between "+Integer.parseInt(args[0])+" and "+Integer.parseInt(args[1])+" will be printed.");
    }
}
