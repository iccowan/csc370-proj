class Main {  
  public static void main(String args[]) { 
    boolean[][] graph = {
      {false, true, false, true, false},
      {true, false, true, false, false},
      {false, true, false, true, false},
      {false, true, false, true, false},
      {false, false, false, true, false}
    };
    
    int bruteForceResult = bruteForce(graph);
  }

  static public int bruteForce(boolean[][] graph) {
    return 1;
  }

  static public int heuristic(boolean[][] graph) {
    return 1;
  }
}