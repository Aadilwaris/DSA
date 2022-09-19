

public static void bubbleSort(int N,int arr[]){
                 for(int i=0;i<N-1;i++){
                         boolean isSorted=false;
                         for(int j=0;j<N-i-1;j++){
                                if(arr[j+1]<arr[j]) {
                                        int temp=arr[j+1];
                                        arr[j+1]=arr[j];
                                        arr[j]=temp;
                                        isSorted=true;
                                }
                         }if(isSorted==false) break;
                 }
                 for(int i=0;i<N;i++){
                        System.out.print(arr[i]+" ");
                 }
        System.out.println();
         }
