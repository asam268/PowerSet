public class PowerSet {

    private int size;
    private char[] set;

    /**
     * Override Constructor for PowerSet object
     * @param size      number of attributes in a set
     * @param set       set of attributes
     */
    public PowerSet(int size, char[] set){
        this.size = size;
        this.set = set;
    }

    public void findPowerSet(){
        if(this.size > 20){
            System.out.println("Set size too large. Must be <= 20.");
        }
        else{
            int psize = (int) Math.pow(2,this.size);
            for(int i = 0; i < psize; i++){
                for(int j = 0; j < this.size; j++){
                    //System.out.print(i & (1<<j));
                    if((i & (1 << j)) > 0)
                        System.out.print(this.set[j]);
                }
                System.out.println();
            }
        }
    }

    public static void main (String[] args){
        char[] set = {'A', 'B', 'C', 'D', 'E'};
        PowerSet test = new PowerSet(5, set);
        //test.findPowerSet();
        for(int x = 0; x < 5; x++){
            System.out.println(1 & x);
        }
    }
}
