
//FloorNumber :https://youtu.be/W9QJ8HaRvJQ?si=5AJJKYvTlmCZYnxd  time 41:16
public class FloorNumber {
          public static void main(String[] args) {
                    int []arr = {1,2,3,4,5,61,63,68,100};
                    int target = 65;
                    int ans = floornumber(arr, target);
                    System.out.println(ans);
          }
          static int floornumber(int []arr,int target){
                    int start = 0;
                    int end = arr.length - 1;
                    boolean IsAsc;
                    if (arr[start] < arr [end]) {
                              IsAsc = true;
                    }
                    else{
                              IsAsc = false;
                    }
                    while (start <= end) {
                              int mid = start + (end-start)/2;
                              if (target == arr[mid]) {
                                        return mid;
                              }
                              if (IsAsc) {
                                       if (target < arr[mid]) {
                                        end  = mid - 1;
                                       } 
                                       else if (target > arr[mid]) {
                                        start = mid + 1;
                                       }
                              }
                              else{
                                        if (target > arr[mid]) {
                                                  end = mid - 1;
                                        }
                                        else if (target < arr[mid]) {
                                                  start = mid + 1;
                                        }
                              }
                    }
                    return end;
          }     
}
