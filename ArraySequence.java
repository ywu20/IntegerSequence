import java.util.NoSuchElementException;
public class ArraySequence implements IntegerSequence{
  private int currentIndex;
  private int []data;

  /*Construct the sequence by copying values from the other array into the data array*/
  public ArraySequence(int [] other){
    currentIndex=0;
    data=new int[other.length];
    for(int i=0;i<other.length;i++){
      data[i]=other[i];
    }
  }
  //Postcondition: The otherseq will be reset.
//This constructor will copy ALL values of the `otherseq` into the data array.
public ArraySequence(IntegerSequence otherseq){

}

public boolean hasNext(){
  if(currentIndex>=data.length){
    return false;
  }
  return true;
}//does the sequence have more elements?
public int next(){
  if(!hasNext()){
    throw new NoSuchElementException();
  }
    currentIndex++;
  return data[currentIndex-1];
}         //return the current value in the sequence and advances to the next element
public int length(){
  return 0;
}     //returns the total length of the sequence
public void reset(){

}     //start over from the start of the sequence

}
