public class PairSwap{

    public int swap(int v1){

    	return (((v1&0xaaaaaaaa)>>>1)|((v1&0x55555555)<<1));

    }

	public static void main(String[] args) {
		PairSwap ps=new PairSwap();
		int t=ps.swap(29);
         System.out.println(t);
	}
}