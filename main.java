             Bidirectional graph 




  import java.util.*;
public class Main {
  public static void main(String[] args) {
  int v=8;
  ArrayList<ArrayList<Integer>>graph= new ArrayList<ArrayList<Integer>>();
  for(int i=0;i<v;i++){
  graph.add(new ArrayList<Integer>());
  }
  graph.get(0).add(1);
  graph.get(1).add(0);
  
  graph.get(0).add(2);
  graph.get(2).add(0);
  
  graph.get(1).add(2);
  graph.get(2).add(1);
  
  graph.get(1).add(3);
  graph.get(3).add(1);
  
  graph.get(2).add(4);
  graph.get(4).add(2);
  
  graph.get(3).add(4);
  graph.get(4).add(3);
  
  graph.get(3).add(6);
  graph.get(6).add(3);
  
  graph.get(4).add(5);
  graph.get(5).add(4);
  
  graph.get(5).add(7);
  graph.get(7).add(5);
  
  graph.get(6).add(7);
  graph.get(7).add(6);
   for(int i=0;i<v;i++){
   System.out.print(i+" -> ");
   for(int neighbour:graph.get(i)){
   System.out.print(neighbour+" ");
   
   
    
  }
  System.out.println();
  
}
}
}


      
  
