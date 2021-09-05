/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Miguel Rosario
 */
import java.util.*;

public class Solution04 {

    public static void main(String[] args) {
	/*
        print: Enter a noun
        'noun' = read string from user
        print: Enter a verb
        'verb' = read string from user
        print: Enter an adjective
        'adjective' = read string from user
        print: Enter an adverb
        'adverb' = read string from user
        'madLib' = Wow, is that your 'adjective' 'noun'? It's crazy how 'adverb' they can 'verb'!
        print: 'madLib'
	*/

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a noun: ");
        String noun = input.nextLine();
        System.out.print("Enter a verb: ");
        String verb = input.nextLine();
        System.out.print("Enter an adjective: ");
        String adjective = input.nextLine();
        System.out.print("Enter an adverb: ");
        String adverb = input.nextLine();
        String madLib = "Wow, is that your " + adjective + " " + noun +"? It's crazy how " + adverb + " they can "+ verb +"!";
        System.out.println(madLib);

    }

}
