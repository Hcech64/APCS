public class ArrayAlgorithms{
    public static void main(String[] args) {
        int [] numbers = {1,2,3,4,5,6,7,8,9};

        System.out.println("the starting array is");
        for (int x = 0; x < numbers.length; x++) {
            System.out.print(numbers[x]);
        }
        System.out.println();
        System.out.println("the total is: " + ArrTotal(numbers));
        System.out.println("The biggest numbers is: " + SearchMax(numbers));
        Swap(numbers);
        System.out.println("The array after the \'Swap\' method is:");
        for (int x = 0; x < numbers.length; x++) {
            System.out.print(numbers[x]);
        }

    }

    // takes each value of the array and adds it to the 'total' integer
    public static int ArrTotal(int[] nums){
        int total = 0;
        for(int x = 0; x < nums.length; x++){
            total += nums[x];
        }
        return total;
    }

    // take each value of the array at compares it to the 'max' integer. if the new number is bigger, it sets max to be the new, bigger number
    public static int SearchMax(int[] nums){
        int max = 0;
        for(int x = 0; x < nums.length; x++){
             if(nums[x] > max){
                max = nums[x];
             }
        }
        return max;
    }

    // goes to every other index in the array and sets the value at the index to zero
    public static void Swap(int[] nums){
        for(int x = 0; x < nums.length - 1; x += 2){
            nums[x] = 0;
       }
    }

}