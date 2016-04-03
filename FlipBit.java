import java.util.ArrayList;
public class FlipBit{

    public int largestsize(int v){
    	if(v==-1) return 32;
    	ArrayList<Integer> list=sequencesize(v);
    	int result=flip(list);
       return result;
    } 
    
    public ArrayList<Integer> sequencesize(int v){
       ArrayList<Integer> list=new ArrayList<Integer>();
       int expectV=0;
       int count=0;

       for(int i=0;i<32;i++){
       	 
       	 if((v&1)!=expectV){

           list.add(count);
           expectV=v&1;
           count=1;

       	 }else{

   	       count++;
       	 
       	 }
       	 v>>>=1;
    
       }
       list.add(count);
       return list;
    }
    public int flip(ArrayList<Integer> list){
    int pre;
    int post;
    int max=0;

     for(int i=0;i<list.size();i=i+2){
     	if(i==list.size()-1) break;
     	if(i==0) {
     		if((list.get(i+1)+1) >max) max=list.get(i+1)+1;
     	}

     	if(list.get(i)==1){
     		
     		 pre=list.get(i-1);
 			post=list.get(i+1);

            
             if((pre+post+1)>max) max=pre+post+1;

     	}else {
     		if(list.get(i+1)!=null)  {

              if((list.get(i+1)+1)> max) max=list.get(i+1)+1;
     	}

     }
     }
     return max;
    }

	public static void main(String[] args) {
		
		FlipBit fb=new FlipBit();
      int result=fb.largestsize(1775);
      System.out.println(result);

	}
}