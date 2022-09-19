public static void selectionSort(int N,int arr[]){
                for(int i=0;i<N;i++){
                        int min = i;
                        for(int j=i+1;j<N;j++){
                                if(arr[min]>arr[j]) min=j;
                        }
                        if(min!=i){
                                int temp=arr[min];
                                arr[min]=arr[i];
                                arr[i]=temp;
                        }
                }
                for(int i=0;i<N;i++){
                        System.out.print(arr[i]+" ");
                 }
