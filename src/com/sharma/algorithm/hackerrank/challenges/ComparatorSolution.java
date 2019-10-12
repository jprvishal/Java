package com.sharma.algorithm.hackerrank.challenges;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Player {
    String name;
    int score;

    Player(String PlayerName, int PlayerScore) {
        this.name = PlayerName;
        this.score = PlayerScore;
    }
}

class Checker implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Player player1 = null;
        Player player2 = null;

        if (o1 != null && o1 instanceof Player) {
          player1 = (Player)o1;
        }

        if (o2 != null && o2 instanceof Player) {
          player2 = (Player)o2;
        }

        if (player1 == null) {
            return -1;
        }

        if (player2 == null) {
            return 1;
        }

        int result = 0;
        if (player1.score < player2.score) {
            return 1;
        } else if (player1.score > player2.score) {
            return -1;
        } else {
            result = player1.name.compareTo(player2.name);
        }

        return result;
    }
}

public class ComparatorSolution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Player[] players = new Player[n];
        Checker checker = new Checker();

        for (int index = 0; index < n; index++) {
            players[index] = new Player(scan.next(), scan.nextInt());
        }

        scan.close();

        Arrays.sort(players, checker);
        for (Player player: players) {
            System.out.printf("%s %s\n", player.name, player.score);
        }
    }
}
