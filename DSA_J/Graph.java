package DSA_J;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Stack;

public class Graph {
  HashMap<Integer, HashMap<Integer, Integer>> map;

  public Graph(int v) {
    this.map = new HashMap<>();
    for (int i = 1; i <= v; i++) {
      map.put(i, new HashMap<>());

    }
  }

  public void addEdge(int v1, int v2, int cost) {
    map.get(v1).put(v2, cost);
    map.get(v2).put(v1, cost); 
  }
  
  public boolean containsEdge(int v1, int v2) {
    return map.get(v1).containsKey(v2) && map.get(v2).containsKey(v1);
  }

  public boolean containsVertex(int v1) {
    return map.containsKey(v1);
  }

  public int noOfEdges() {
    int sum = 0;
    for (int key : map.keySet()) {
      sum += map.get(key).size();

    }
    return sum / 2;
  }

  public void removeEdge(int v1, int v2) {
    if (containsEdge(v1, v2)) {
      map.get(v1).remove(v2);
      map.get(v2).remove(v1);
    }
  }
   
  public void removeVertex(int v1) {
    for (int key : map.get(v1).keySet()) {
      map.get(key).remove(v1);

    } 
    map.remove(v1);
  }

  public void display() {
    for (int key : map.keySet()) {
      System.out.println(key + "-->" + map.get(key));
    }
  }
  // public boolean BFS(int src,int dst){
  // LinkedList<Integer>qq=new LinkedList<>();
  // HashSet<Integer>visited=new HashSet<>();
  // qq.add(src);
  // while(!qq.isEmpty()){
  //   int r=qq.remove();
  //   if(visited.contains(r));
  //   continue;
  //   visited.add(r);
  //   if(r==dst)
  //   return true;
  //   for(int nbrs:map.get(r).keySet()){
  //     if(!visited.contains(nbrs))
  //     qq.add(nbrs);
  //   }
  // }
  // return false;
  // }
  public boolean DFS(int src,int dst){
    Stack<Integer>stk=new Stack<>();
    HashSet<Integer>visited=new HashSet<>();
    stk.push(src);
    while(!stk.isEmpty()){
      //remove
      int r=stk.pop();
      //Ignore if Visited
      if(visited.contains(r))
      continue;
      //Visited mark
      visited.add(r);
      if(r==dst)
      return true;
      for(int nbrs:map.get(r).keySet()){
        if(!visited.contains(nbrs))
        stk.push(nbrs);

      }

    }
    return false;
  }
  public void paths(int src,int dst,HashSet<Integer>visited,String ans){
    if(src==dst){
      System.out.println(src+ans);
      return;
    }
  visited.add(src);
  for(int nbrs:map.get(src).keySet()){
    if(!visited.contains(nbrs)){
      paths(src, dst, visited, ans+src+" ");
    }
  }
    visited.remove(src);
  }
}
