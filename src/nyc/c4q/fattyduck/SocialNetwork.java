package nyc.c4q.fattyduck;
/**
 * Created by fattyduck on 4/2/15.
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class SocialNetwork {

    public static HashSet<String> allFriends(HashSet<String> yours, HashSet<String> mine) {
        // Yelena, Jamal, Eve, Sebastian, Mala

        HashSet<String>all = new HashSet<String>(mine);
        all.addAll(yours);
        return all;
    }

    public static HashSet<String> mutualFriends(HashSet<String> yours, HashSet<String> mine) {
        // Eve
        HashSet<String> mutual = new HashSet<String>();
        for(String str: yours){
            if(mine.contains(str)){
                mutual.add(str);
            }
        }

        return mutual;
    }

    public static HashSet<String> YourFriends(HashSet<String> yours, HashSet<String> mine) {
        // Yelena, Jamal
        HashSet<String> justYours=new HashSet<String>(yours);
        for(String str: mine){
            if(yours.contains(str)){
                justYours.remove(str);
            }
        }
        return justYours;
    }

    public static HashSet<String> MyFriends(HashSet<String> yours, HashSet<String> mine) {
        // Sebastian, Mala
        HashSet<String> justMines=new HashSet<String>(mine);
        for(String str: yours){
            if(mine.contains(str)){
                justMines.remove(str);
            }
        }
        return justMines;
    }

    public static HashSet<String> exclusiveFriends(HashSet<String> yours, HashSet<String> mine) {
        // Yelena, Jamal, Sebastian, Mala
        HashSet<String> Exclusive=new HashSet<String>(mine);
        Exclusive.addAll(yours);
        for(String str: yours){
            if(mine.contains(str)&&yours.contains(str)){
                Exclusive.remove(str);
            }
        }
        return Exclusive;
    }

    public static boolean yourFriendsAreMine(HashSet<String> yours, HashSet<String> mine) {
        // true if all your friends are also my friends
        boolean yfam =false;
        if(mine.containsAll(yours)){
            yfam = true;
        }
        return yfam;
    }

    public static boolean youHaveFriends(HashSet<String> yours) {
        // true if you have any friends
        boolean youHave=false;
        if(yours.size()>0){
            youHave=true;
        }
        return youHave;
    }

    public static HashSet<HashSet<String>> matchmaker(HashSet<String> yours, HashSet<String> mine) {
        // should return these sets:

        // Sebastian, Jamal
        // Jamal, Mala
        // Jamal, Eve

        // Sebastian, Yelena
        // Yelena, Mala
        // Yelena, Eve

        // Sebastian, Eve
        // Mala, Eve
        HashSet<HashSet<String>> setOfSets= new HashSet<HashSet<String>>();

        return setOfSets;

    }

    public static void main(String[] args) {
        HashSet<String> yours = new HashSet();
        yours.add("Yelena");
        yours.add("Jamal");
        yours.add("Eve");
        HashSet<String> mine = new HashSet();
        mine.add("Sebastian");
        mine.add("Mala");
        mine.add("Eve");

        // You should be able to run all of these in a row:
        System.out.println( allFriends(yours, mine) );
        System.out.println( mutualFriends(yours, mine) );
        System.out.println( YourFriends(yours, mine) );
        System.out.println( MyFriends(yours, mine) );
        System.out.println( exclusiveFriends(yours, mine) );
        System.out.println( yourFriendsAreMine(yours, mine) );
        System.out.println( youHaveFriends(yours) );
        System.out.println( matchmaker(yours, mine) );
    }

}