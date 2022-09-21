/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sptv21textchar;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Anatoli
 */
public class SPTV21TextChar {

    /**
     * @param args the command line arguments
     */
static Set<Integer> alphabet = new HashSet<>(26);

public static void main(String[] args) {
    int cnt = 0;
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter your text: ");
    String str = scanner.nextLine();
    for (char c : str.toCharArray()) {
        int n = c - 'a';
        if (n >= 0 && n < 26) {
            if (alphabet.add(n)) {
                cnt += 1;
                if (cnt == 26) {
                    System.out.println("Found all letters");
                    break;
                }else{
                    System.out.println("Not all letters");
                    break;
                }
            }
        }
    }
  }
}