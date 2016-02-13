package com.projectxanadu.jokes;

import java.util.Random;

public class Galifianakis {

    private Random mRand;

    private String[] mJokeTable = {
            "A couple of kids tried using pickles for a Ping-Pong game.  They had the volley of the Dills.",

            "A banker fell over board.  His friends couldn't find a life preserver. One asked, \"Can you float alone?\"",

            "The women at one college called a would be romeo a great natural athlete. He makes every broad jump.",

            "A filibuster, throughing your wait around.",

            "A reverend wanted to call another reverend.  He told the operator, this" +
            "is a parson to parson call.",

            "A farmer with lots of chickens posted the following sign.  \"Free Chickens. " +
            "Our Coop Runneth Over.\"",

            "A friend  got some vinegar in his ear, now he suffers from pickled hearing.",

            "Inheritance taxes are getting so out of line, that the deceased family " +
            "often doesn't have a legacy to stand on.",

            "A rock store was closed by the police, they were taking too much for granite.",

            "A man who keep stealing mopeds was an obvious cycle-path.",

            "A women was in love with fourteen soldiers, it platoonic.",

            "Max told his friend he didn't want to go for a hike in the hills.  \"I'm " +
            "an anti-climb Max.\"",

            "A new wagon designed for LA rush hour traffic is called the Stationary wagon.",

            "An Uncle died, left several hundred clocks to a niece, she's busy winding up the estate.",

            "Two cheerleaders ended up married, they met by chants.",

            "Two cans of paint got married, later the bride whispered, \"Darling, " +
            "I think I'm pigment.\"",

            "Two boy silkworms pursued a luscious girl silkworm.  They ended up in a tie.",

            "A doctor told the boy, \"This injection won't hurt a bit.\"  That's an MD promise.",

            "An Indian family with sixteen kids was just one big Hopi family."
    };

    public Galifianakis() {
        mRand = new Random();
        mRand.setSeed(System.currentTimeMillis());
    }
    public String getJoke() {
        return mJokeTable[Math.abs(mRand.nextInt()) % mJokeTable.length];
    }
}
