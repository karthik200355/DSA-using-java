class Solution{
  public static void reverseArray(int arr[]){
    int n=arr.length;
    int[] temp=new int[];
    for (int i =0;i<n;i++)
      temp[n]=arr[n-i-1];
    for (int i =0;i<n;i++)
      arr[n]=temp[i];
  }
  public static void main(String[] args){
    int[] arr={3,4,9,5,6,8};
    reverseArray(arr);
    for(int i=0;i<=arr.length;i++)
      System.out.print(arr[i]+"");
  }
}
