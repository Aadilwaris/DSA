public static void insertionSort(int N,int arr[]){
                 for(int i=1;i<N;i++){
                         int temp=arr[i];
                         int j=i-1;
                         while(j>=0&&arr[j]>temp){
                                 arr[j+1]=arr[j];
                                 j--;
                         }
                         arr[j+1]=temp;
                         //j++;
                 }
                 for(int i=0;i<N;i++){
                        System.out.print(arr[i]+" ");
                 }
                 System.out.println();
         }

