package com.example;

import java.util.Random;

public class JokeBox {

   public static String[] joke;
   public JokeBox()
    {
        joke=new String[5];
        joke[0]="Q: What do cars eat on their toast? \n" +
                "A: Petroleum jelly";
        joke[1]="Q: Did you hear about the guy who dreamed he was eating a giant marshmallow? \n" +
                "A: When he woke up, his pillow was gone.";
        joke[2]="Q: What do you call an alligator wearing a vest? \n" +
                "A: An investigator.";
        joke[3]="Q: What do you call a dream where animals attack you?\n" +
                "A: A bitemare";
        joke[4]="Q: What Do You Call A Cow With No Legs\n" +
                "A: Ground Beef";
    }




        public static String getJokes() {
            return joke[new Random().nextInt(joke.length)];
        }





}
