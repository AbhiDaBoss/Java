class numswitch{
    public static void main(String[] args){
   int n=5;
   int bin[]=new int[20];
   int i=0;
   
   while(n>0){
       bin[i]=n%2;
       n=n/2;
       i++;
   }
   for(int j=i-1; j>=0; j--){
       System.out.print(bin[j]);
   }
}}
