import java.util.Arrays;
class solution{
  public static void rotateArray(int[] arr,int d){
    int n=arr.length;
    for(int i=0;i<d;i++){
      int first =arr[0];
      for(int j=0;j<n-1;j++){
        int arr[j]=arr[j+1];
      }
      arr[n-1]=first;
    }
  }
  public static void main(string[] args)
  {
    int[]arr={1,2,3,4,5,6};
    int d=2;
    rotateArray(arr,d);
    for (int i =0;i<arr.length;i++)
      System.out.print(arr[i]+" ");
  }
}
      
