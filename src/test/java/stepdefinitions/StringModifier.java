package stepdefinitions;

import java.util.Random;

public class StringModifier {
    //In order to generate new emails and usernames

    private String characters = "qwertyuiopasdfghjklzxcvbnm1234567890";
    private String newEmail = "";
    private String newUser = "";
    private String newTooLongUser = "";
    private int normalLength = 10;
    char[] randomArray = new char[normalLength];
    char[] randomUserArray = new char[normalLength];
    char[] tooLongArray = new char[102];
    Random rand = new Random();


    public String randomEmailString() {
        for (int i = 0; i < normalLength; i++) {
            randomArray[i] = characters.charAt(rand.nextInt(characters.length()));
        }
        for (int j = 0; j < randomArray.length; j++) {
            this.newEmail += randomArray[j];
        }
        return newEmail + "@email.se";
    }

    public String randomUserString() {
        for (int i = 0; i < normalLength; i++) {
            randomUserArray[i] = characters.charAt(rand.nextInt(characters.length()));
        }
        for (int j = 0; j < randomUserArray.length; j++) {
            this.newUser += randomUserArray[j];
        }
        return newUser;
    }

    public String userNameTooLong() {
        for (int i = 0; i < 102; i++) {
            tooLongArray[i] = characters.charAt(rand.nextInt(characters.length()));
        }
        for (int j = 0; j < tooLongArray.length; j++) {
            this.newTooLongUser += tooLongArray[j];
        }
        return newTooLongUser;
    }

}





