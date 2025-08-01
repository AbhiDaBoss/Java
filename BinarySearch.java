import java.util.Scanner;

public class BinarySearch {
    
    public static void main(String[] args){
        Scanner snr=new Scanner(System.in);

        System.out.println("Enter the number of elements: ");
        int n=snr.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements: ");
        
        for(int i=0; i<n; i++){
            arr[i]=snr.nextInt();
        }

System.out.println("Enter the element to search: ");
int k=snr.nextInt();

int left=0, right=n-1;
while(left<=right){

    int mid=(left+right)/2;
    if (arr[mid]==k){
        System.out.println("The element is found at "+mid);
        break;
    }

        else if (arr[mid]<k)
        left=mid+1;
        else
        right=mid-1;
        
    }
}}
