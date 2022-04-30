// [1,2,3,1,2]
//  2

//after sorting[1,1,2,2,3]
//looping for check 
//now count=1
//count inc
// [[1, 2, 1, 2, 1]]
// 4

import java.util.*;

class CoupleEntry{
    static int findPairs(int[] dresses, int number_of_dresses){
        Arrays.sort(dresses);
        int totalPairs=0;
        int iterator=0;
        while(iterator<number_of_dresses){
            int currentNumber=dresses[iterator];
            int count=1;
            count++;
            while(iterator<number_of_dresses && dresses[iterator]==currentNumber){
                
                count++;
                iterator++;
            }
            if(count>=2){
                totalPairs=totalPairs+ count/2;
            }
        }
        System.out.println(totalPairs);
        return totalPairs;


    }

    public static void main(String[] args){
        // Scanner scm=new ();
        // int number_of_dresses= scm.nextInt();
        // int[] dresses=new int[number_of_dresses];
        // dresses=1,2,3,1,2;
        int dresses[] = {1,2,3,1,2};
        int number_of_dresses=5;
        System.out.println(findPairs(dresses, number_of_dresses));
        


        // for(int i=0;i<number_of_dresses;i++){

        //     dresses[i]=scm.nextInt;
        // }



    }
}