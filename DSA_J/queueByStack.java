package DSA_J;
import java.util.Stack;
public class queueByStack {
  private Stack<Integer>stck;
  private int front=0;
  private int size=0;
  public queueByStack(){
    stck=new Stack<>();

  }
  public boolean isEmpty(){
    return stck.empty();
  }
  
  public int deQue(){
   if(size==1){
    int rv=stck.peek();
    stck.pop();
    return rv;
   }
   Stack<Integer>st1=new Stack<>();
   while(!stck.empty()){
   st1.push(stck.peek());
    stck.pop();
  }
  int delD=st1.peek();
  st1.pop();
  return delD;
  }

}
