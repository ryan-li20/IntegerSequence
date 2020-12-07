public class Tester{
  public static void main(String[] args){
    // IntegerSequence r = new Range(10,15);
    // while(r.hasNext()){
    //   System.out.print(r.next());
    //   if( r.hasNext() ){
    //      System.out.print( ", " );
    //   }
    // }
    // System.out.println();
    int[]nums = {1,3,5,0,-1,3,9};
    IntegerSequence asd = new ArraySequence(nums);

    System.out.println("ArraySequence(array):");
    while(asd.hasNext()){
      System.out.print(asd.next()+", ");
    }
    System.out.println();
    IntegerSequence r = new Range(10,20);
    IntegerSequence as = new ArraySequence(r);

    System.out.println("ArraySequence(seq):");
    while(as.hasNext()){
      System.out.print(as.next()+", ");
    }
    System.out.println();
  }
}
