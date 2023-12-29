import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    static int N;
    static int[] nums;
    static int[] temp;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        nums = new int[N];
        temp = new int[N];

        for(int i=0; i<N; i++){
            nums[i] = Integer.parseInt(br.readLine());
        }

        mergeSort(0, N - 1);

        for(int i=0; i<N; i++){
            sb.append(nums[i]).append('\n');
        }

        System.out.print(sb);
    }

    static void mergeSort(int start, int end){
        if(start >= end) return;

        int mid = (start + end) / 2;
        mergeSort(start, mid);
        mergeSort(mid + 1, end);

        for(int i=start; i<=end; i++){
            temp[i] = nums[i];
        }

        int left = start;
        int right = mid + 1;
        int index = start;

        while(left <= mid && right <= end){
            if(temp[left] < temp[right]){
                nums[index++] = temp[left++];
            }else{
                nums[index++] = temp[right++];
            }
        }

        while(left <= mid){
            nums[index++] = temp[left++];
        }

        while(right <= end){
            nums[index++] = temp[right++];
        }
    }

}
