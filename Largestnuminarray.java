public class Largestnuminarray {
    public static void main(String[] args) {
        int[] myArray={1,3,4,5,12,1,3};
        int num=myArray[0];
        for (int i : myArray) {
            if (num<i)
            num=i;
        }
        System.out.println(num);
    }
    
}
