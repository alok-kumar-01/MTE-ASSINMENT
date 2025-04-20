import java.util.Arrays;

public class Q21 {
  public static int[] countBit(int n){
    if(n<=0){
      return new int[]{0};

    }
    int [] arr =new int[n+1];
    arr[0]=0;
    for(int i=1;i<=n;i++){
      arr[i]=arr[i/2] +(i & 1);
    }
    return arr;
  }
  public static void main(String[] args) {
    int arr[]=countBit(7);
    System.out.println(Arrays.toString(arr));
    
  }
  
}
