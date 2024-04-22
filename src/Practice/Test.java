package Practice;

import java.sql.SQLOutput;

public class Test {
    public static void main(String[] args) {

        int n;
        int[] arr = {1,2,3,4,5};
        for(int i = 0; i < arr.length ; i++) {
            n = arr[i];
            for(int j = i+1; j<arr.length ; j++){
                if(n>arr[j]){
                    n=arr[i];
                    arr[j]=arr[i];
                }
                    arr[i]=n;

            }
            for(int demo : arr)
            System.out.println(demo);;
        }

    }
}
