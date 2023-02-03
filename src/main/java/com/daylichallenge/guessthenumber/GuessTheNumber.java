/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.daylichallenge.guessthenumber;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author konate-mk
 */
public class GuessTheNumber {

  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      Random rand = new Random();

      int targetNumber = rand.nextInt(100) + 1;
      int guess;
      int attempts = 0;

      System.out.print(targetNumber);

      System.out.print("Devine le nombre (1 à 100): ");

      do {
        guess = sc.nextInt();
        attempts++;
        if (guess > targetNumber) {
          System.out.println("Le nombre est plus petit!");
        } else if (guess < targetNumber) {
          System.out.println("Le nombre est plus grand!");
        }
      } while (guess != targetNumber && attempts < 5);
      if (guess == targetNumber) {
        System.out.println(
          "Félicitations! Tu as deviné le nombre en " +
          attempts +
          " tentatives."
        );
      } else {
        System.out.println("Tu as perdu! Le nombre était " + targetNumber);
      }
    }
  }
}
/**
 *
 * @author konate-mk
 */
