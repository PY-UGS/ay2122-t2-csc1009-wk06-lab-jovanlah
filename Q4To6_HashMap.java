import java.util.*;

public class Q4To6_HashMap {

    public static HashMap<Integer,Integer> hashMap = new HashMap<>();

    public static void main(String[] args){

        //question 4
        for(int i=0, j=1; i<=5 && j<=11; i++, j+=2){
            hashMap.put(i,j);
        }
        System.out.println("Before insert:" + hashMap.toString());
        System.out.println("Please enter insert Integer: ");
        Scanner in = new Scanner(System.in);
        HashMap<Integer,Integer>sorted = addAndSort(hashMap, in.nextInt());
        System.out.println("After insert:" + sorted.toString());
        in.close();

        //question 5
        System.out.println("\nBefore swap:" + hashMap.toString());
        hashMap = swapValues(hashMap, 1, 5);
        System.out.println("After swap:" + hashMap.toString());

        //question 6
        int min = 1000;
        int max = 9999;
        //generate random hashmap
        HashMap<Integer,Integer> randHashMap = randHashMapGenerator(min, max);
        System.out.println("\nRandom generated list: " + randHashMap);

        //generate random numnber and search in hashmap
        int randNum = (int)Math.floor(Math.random()*(max-min+1)+min);
        System.out.println("\nSearching number:" + randNum);
        int position = searchValue(randHashMap, randNum);
        System.out.println("Returned position of the searched value: " + position);
    }
    
    public static HashMap<Integer,Integer> addAndSort(HashMap<Integer,Integer> hashMap, int value){

        hashMap.put(hashMap.size(),value);
        // quickSort(hashMap, 0, 6);
        boolean sort = false;
        while(!sort){
            sort = true;
            for(int i = 1; i < hashMap.size(); i++){
                if(hashMap.get(i) < hashMap.get(i - 1)){
                    hashMap = swapValues(hashMap, i, i - 1);
                    sort = false;
                }
            }
        }
        
        return hashMap;
    }

    public static HashMap<Integer,Integer> swapValues(HashMap<Integer,Integer> hash, int index1,int index2)
    {
        int element1 = (int) hash.get(index1);
        int element2 = (int) hash.get(index2);

        hash.replace(index2, element1);
        hash.replace(index1, element2);

        return hash;
    }
    public static HashMap<Integer,Integer> randHashMapGenerator(int min, int max){

        HashMap<Integer,Integer> newRandrandHashMap = new HashMap<>();

        for(int i=0;i<500;i++){
            newRandrandHashMap.put(i,(int)Math.floor(Math.random()*(max-min+1)+min));
        }
        return newRandrandHashMap;
    }

    public static int searchValue(HashMap<Integer,Integer> randHashMap, int searchNum){

        for (int i=0;i<randHashMap.size();i++){
            if  (randHashMap.get(i) == searchNum){
                return i;
            }
        }
        return -1;
    }


    // public static void swap(HashMap<Integer,Integer> hashMap, int i, int j)
    // {
    //     int temp = hashMap.get(i);
    //     hashMap.replace(i, hashMap.get(j));
    //     hashMap.replace(j, temp);
    // }
    
    /* This function takes last element as pivot, places
    the pivot element at its correct position in sorted
    hashMapay, and places all smaller (smaller than pivot)
    to left of pivot and all greater elements to right
    of pivot */
    // public static int partition(HashMap<Integer,Integer> hashMap, int low, int high)
    // {
        
    //     // pivot
    //     // int pivot = hashMap[high];
    //     int pivot = hashMap.get(high);
        
    //     // Index of smaller element and
    //     // indicates the right position
    //     // of pivot found so far
    //     int i = (low - 1);
    
    //     for(int j = low; j <= high - 1; j++)
    //     {
            
    //         // If current element is smaller
    //         // than the pivot
    //         if (hashMap.get(j) < pivot)
    //         {
                
    //             // Increment index of
    //             // smaller element
    //             i++;
    //             swap(hashMap, i, j);
    //         }
    //     }
    //     swap(hashMap, i + 1, high);
    //     return (i + 1);
    // }
    
    // /* The main function that implements QuickSort
    //         hashMap[] --> hashMap to be sorted,
    //         low --> Starting index,
    //         high --> Ending index
    // */
    // public static void quickSort(HashMap<Integer,Integer> hashMap, int low, int high)
    // {
    //     if (low < high)
    //     {
            
    //         // pi is partitioning index, hashMap[p]
    //         // is now at right place
    //         int pi = partition(hashMap, low, high);
    
    //         // Separately sort elements before
    //         // partition and after partition
    //         quickSort(hashMap, low, pi - 1);
    //         quickSort(hashMap, pi + 1, high);
    //     }
    // }
}