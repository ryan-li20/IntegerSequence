import java.util.*;
public class ArraySequence implements IntegerSequence{
  private int currentIndex;
  private int[] data;

  public int[] getData(){
    return data;
  }
  /*Construct the sequence by copying values from the other array into the data array*/
  public ArraySequence(int [] other){
    data = new int[other.length];
    for(int i = 0; i < other.length; i++){
      data[i] = other[i];
    }
    currentIndex = 0;
  }

  public ArraySequence(IntegerSequence otherseq){
    data = new int[otherseq.length()];
    otherseq.reset();
    currentIndex = 0;
    while(otherseq.hasNext()){
      data[currentIndex] = otherseq.next();
      currentIndex++;
    }
    otherseq.reset();
    currentIndex = 0;
  }

  public void reset(){
    currentIndex = 0;
  }

  public int length(){
    return data.length;
  }

  public int next(){
    if(hasNext()){
      currentIndex++;
      return data[currentIndex-1];
    }
    else{
      throw new NoSuchElementException("No such element exists");
    }
  }

  public boolean hasNext(){
    return currentIndex <= data.length-1;
  }
}
