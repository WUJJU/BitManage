
public class BinaryReprent{
   
   StringBuilder sb=new StringBuilder();

	public StringBuilder present(double v){
       sb.append(".");
      if(v<0||v>1) throw new IllegalArgumentException("ERROR");

       while(v>0){
       	if(sb.length()>32){throw new IllegalArgumentException("ERROR");}
       	v=v*2;
       	if(v>=1){
       		sb.append(1);
       		v=v-1;
       	}
       	else{
       		sb.append(0);
       	}
       }
       return sb;
	}

	public static void main(String[] args) {
		BinaryReprent br=new BinaryReprent();
		StringBuilder b=br.present(0.75);
		System.out.println(b.toString());
	}
}