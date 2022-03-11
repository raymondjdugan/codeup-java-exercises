package arrays;

import java.util.Random;

public class ServerNameGenerator {
    private static final String [] nouns = {"whale", "school", "steve", "dog", "pencil", "apple", "bull", "cap", "child", "city"};
    private static final String [] adjectives = {"abounding", "boorish", "cloistered", "incompetent", "nonsensical", "parsimonious", "rambunctious", "salty", "voracious", "zany"};

    private static int getRandomNumber(int arrayLength){
        Random randomNumber = new Random();
        return randomNumber.nextInt(arrayLength);
    }

    public static void main(String[] args) {
        System.out.println("Here is your serer name:");
        System.out.printf("%s-%s", adjectives[getRandomNumber(adjectives.length)],nouns[getRandomNumber(nouns.length)]);
    }
}
