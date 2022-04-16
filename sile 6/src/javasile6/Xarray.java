package javasile6;

public class Xarray {

    public static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void Sort_Arr(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    swap(a, i, j);
                }
            }
        }
    }

    public static int min(int[] a) {
        int m = a[0];
        for (int i = 1; i < a.length; i++) {
            if (m > a[i]) {
                m = a[i];
            
            }
        }
        return m;
    }
    public static double[] romeve (double[] arr, int i){
        for (int j=i; j<arr.length-1;j++){
            arr[j]=arr[j+1];
        }
        return arr;
    }
}
        
    
 