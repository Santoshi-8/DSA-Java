package Arrays;

public class twoSum {
    public static void main ( String[] args){

       int [] nums = {2,7,11,15};
       int target =15;
       boolean found = false;


         for (int i=0; i< nums.length; i++){
            for (int j= i+1; j< nums.length; j++){
                if (nums[i]+ nums[j]==target){
                    System.out.println("output at [" + i+","+j +"]");
                    found = true;
                    break;
                } // if
            }// inner for loop
         }// outer for loop
        if(!found){
            System.out.println("target not found");

        }


    }

}



