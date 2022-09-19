//Partion funtion

public static int partition(int a[],int l,int h){
                int pivot=a[h];
                int i=l-1;
                for(int j=l;j<h;j++){
                        if(a[j]<pivot){
                                i++;
                                int temp=a[i];
                                a[i]=a[j];
                                a[j]=temp;
                        }
                }
                i++;
                int temp=a[h];
                a[h]=a[i];
                a[i]=temp;
                return i;
}

//Quick Sort function

public static void quickSort(int a[],int l,int h){
                if(l<h){
                        int pivot = partition(a,l,h);
                        quickSort(a,l,pivot-1);
                        quickSort(a,pivot+1,h);
                }
}
