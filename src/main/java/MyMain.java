import java.util.ArrayList;

public class MyMain {

    // Counts the number of odd numbers in list
    public static int countOdd(ArrayList<Integer> list) { 
        int l = list.size();
        int count = 0;
        for(int i = 0; i < l; i++){
            int n = list.get(i);
            if(n % 2 != 0){
                count++;
            } 
        }
        return count;
    }

    // Returns true if there is an int that appears in both lists
    public static boolean checkDuplicates(ArrayList<Integer> list1, ArrayList<Integer> list2) { 
        int length1 = list1.size();
        int length2 = list2.size();
        for(int i = 0; i < length1; i++){            
            for(int j = 0; j < length2; j++){
                int x = list1.get(i);
                int y = list2.get(j);
                if(x == y){
                    return true;
                } 
            }
        }
        return false;
    }

    // Takes an int[] as input and returns the equivalent ArrayList<Integer>
    public static ArrayList<Integer> convertToArrayList(int[] arr) { 
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < arr.length; i++){
            list.add(arr[i]);
        }
        return list;
    }


    public static void main(String[] args) {
        // Write some code here to test your methods!
    }
}
