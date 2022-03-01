import java.util.*;

public class Q3SearchRandNum_Llist_Built_In {
    public static void main(String[] args){
        //question 3
        int min = 1000;
        int max = 9999;
        int n = 500;

        LinkedList<Integer> randList = randListGenerator(min, max, n);
        int randNum = (int)Math.floor(Math.random()*(max-min+1)+min);
        System.out.println("\nSearching number:" + randNum);
        int position = searchValue(randList, randNum);
        System.out.println("Returned position of the searched value: " + position);
    }

    public static LinkedList<Integer> randListGenerator(int min, int max, int n){

        LinkedList<Integer> newRandList = new LinkedList<>();

        for(int i=0;i<n;i++){
            newRandList.add((int)Math.floor(Math.random()*(max-min+1)+min));
        }
        System.out.println("\nRandom generated list: " + newRandList);
        return newRandList;
    }

    public static int searchValue(LinkedList<Integer> list, int searchNum){

        for (int i=0;i<list.size();i++){
            if  (list.get(i) == searchNum){
                return i;
            }
        }
        return -1;
    }
}
