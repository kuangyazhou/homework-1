import java.util.Arrays;

public class myArray{
    private int [] arr=new int[20];
    private int i=0;
    public void add(int num){
        arr[i]=num;
        i++;
    }
    public void sort(){
        for (int n=0;n<arr.length-1;n++)
            for (int j = n; j < arr.length - 1; j++) {
                if (arr[n] > arr[j + 1]) {
                    int temp = arr[n];
                    arr[n] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
    }

    public int max(){
        int temp=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>temp){
                temp=arr[i];
            }
        }
        return temp;
    }

    public int length(){
        return arr.length;
    }
    public static void main(String[] args){
        myArray arr1=new myArray();
        arr1.add(1);
        arr1.add(3);
        arr1.add(2);
        arr1.sort();
        System.out.println(arr1.length());
        System.out.println(arr1.max());
        System.out.print(arr1);
    }
}






//public class myArray {
//    private int[] data;
//    public void add(int a){
////        data[0]=a;
////        return data;
//    }
//
////    public int[] sort(){
////        return data.sort();
////    }
//
//    public int Max(){
//        int max=0;
////        for (int i=0;i<data.size();i++){
////            if(data[i]>max) max=data[i];
////        }
//        return max;
//    }
//
////    public int length(){
////        return data.size();
////    }
//
//}
