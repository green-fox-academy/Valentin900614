import java.util.*;

public class Matchmaking{
    public static void main(String[] args){
        ArrayList<String> girls = new ArrayList<String>(Arrays.asList("Eve","Ashley","Claire","Kat","Jane"));
        ArrayList<String> boys = new ArrayList<String>(Arrays.asList("Joe","Fred","Tom","Todd","Neef","Jeff"));

        // Write a method that joins the two lists by matching one girl with one boy into a new list
        // If someone has no pair, he/she should be the element of the list too
        // Exepected output: "Eve", "Joe", "Ashley", "Fred"...

        System.out.println(makingMatches(girls, boys));
    }
    public static ArrayList makingMatches(ArrayList firstList, ArrayList secondList) {
        ArrayList<String> joinedList = new ArrayList<>();
        for (int i = 0; i < firstList.size(); i++) {
            for (int j = 0; j < secondList.size(); j++) {
                if (i == j){
                    joinedList.add(firstList.get(i).toString());
                    joinedList.add(secondList.get(j).toString());

                }
            }
        }
        if (firstList.size() - secondList.size() > 0) {
            for (int k = 0; k < firstList.size() - secondList.size(); k++) {
                joinedList.add(firstList.get((firstList.size()+k)-(firstList.size()-secondList.size())).toString());
            }
        }   else if (firstList.size() - secondList.size() < 0){
            for (int k = 0; k < secondList.size() - firstList.size(); k++) {
                joinedList.add(secondList.get((secondList.size()+k)-(secondList.size()-firstList.size())).toString());
            }

        }
        return joinedList;
    }
}