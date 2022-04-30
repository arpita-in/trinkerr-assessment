// Input: keys = ["idea", "idae", "bsnl", "nsbl", "grasim", "bata"]

// Output: [["idea", "idae"], ["bsnl", "nsbl"], ["bata"], ["grasim"]]
//loop step done
//
import java.util.*;


class Intern{
    public static List<List<String>> printAnagrams(String[] key_arr){
        List<List<String>> result = new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();
        for(String str:key_arr){
            char[] chArr=str.toCharArray();
            Arrays.sort(chArr);
            String key = new String(chArr);
            if(map.containsKey(key)){
                map.get(key).add(str);
            }
            else{
                List<String> strList = new ArrayList<>();
                strList.add(str);
                map.put(key, strList);
            }
        }
        result.addAll(map.values());
        return result;






    }
    // static void printAnagrams(String key_arr[], total_keys){
    //         Duplicates duplicates= new Duplicates(key_arr, total_keys);
    //         int i;
    //         for(i=0;i<total_keys; ++i){
    //             char[] char_arr= duplicates.array[i].str.toCharArray();
    //             Arrays.sort(char_arr);
    //             Duplicates.array[i].str= new String(char_arr);

    //         }
    //         Arrays.sort(duplicates.array, new compStr());
    //         for(i=0;i<total_keys; ++i){
    //             System.out.print(key_arr[duplicates.array[i].index] + " ");
    //         }

    // }
    public static void main(String[] args){

        String key_arr[]={"idea", "idae", "bsnl", "nsbl", "grasim", "bata"};
        List<List<String>> result = printAnagrams(key_arr);
        result.forEach(t -> System.out.print(t + " "));

        // int total_keys=key_arr.length;
        // printAnagrams(key_arr, total_keys);

        // System.out.println(findPairs(dresses, number_of_dresses));
        


        // for(int i=0;i<number_of_dresses;i++){

        //     dresses[i]=scm.nextInt;
        // }



    }
}