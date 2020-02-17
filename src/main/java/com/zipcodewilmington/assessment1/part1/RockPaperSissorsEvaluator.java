package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class RockPaperSissorsEvaluator {
    protected static final String ROCK = "rock";
    protected static final String PAPER = "paper";
    protected static final String SCISSOR = "scissor";

    /**
     * @param handSign a string representative of a hand sign
     * @return the respective winning move
     */
    public String getWinningMove(String handSign) {

        String wres = "";
        switch(handSign){

            case("rock"):
                wres = "paper";
                break;

            case("scissor") :
                wres = "rock";
                break;

            case("paper"):
                wres = "scissor";
                break;

        }

        return wres;
    }

    /**
     * @param handSign a string representative of a hand sign
     * @return the respective losing move
     */
    public String getLosingMove(String handSign) {

        String lres = "";
        switch(handSign){

            case("rock"):
                lres = "scissor";
                break;

            case("scissor") :
                lres = "paper";
                break;

            case("paper"):
                lres = "rock";
                break;

        }

        return lres;
    }

    /**
     * @param handSignOfPlayer1 a string representative of a hand sign of a player
     * @param handSignOfPlayer2 a string representative of a hand sign of a challenger
     * @return a string representative of the winning hand sign between the two players
     */
    public String getWinner(String handSignOfPlayer1, String handSignOfPlayer2) {

        String res = "";

        if (handSignOfPlayer1 == "rock" && handSignOfPlayer2 == "scissor") { res = "rock";}
        if (handSignOfPlayer1 == "rock" && handSignOfPlayer2 == "paper") { res = "paper";}
        if (handSignOfPlayer1 == "paper" && handSignOfPlayer2 == "scissor") { res = "scissor";}

        return res;
    }
}
