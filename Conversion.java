public class Conversion{
   
   public int convert(int v1,int v2){

         int count=0;

   	    for(int c=v1^v2;c!=0;c=c&(c-1)){
            count++;
   	    }
   	    return count;

   }

   public static void main(String[] args) {

   	Conversion cc=new Conversion();
   	int result=cc.convert(29,115);

       System.out.println(result);
   	
   }



}