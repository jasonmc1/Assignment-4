  import java.util.Scanner;
  import java.util.LinkedList;
  import java.io.PrintWriter;
  import java.io.File;
  import java.util.Collections;
  import java.util.Queue;
 class Movie{
      Node left;
      Node right;
      int input;
      //allows the moviesBST class to call binary tree here
      public Movie(String a, String b){
          a = this.a;
          b = this.b;
        }
      Node(String in) {
          left = null;
          right = null;
          input = in;
      }
      //reads in file and sorts names and dates apart into left and right children nodes
      BinaryTree<String> titles(String movies){
         File f = new File("movies.csv");
         Scanner scan = new Scanner(f);
         root = null;
         
         Stack<BinaryTree<String>> st = new Stack<BinaryTree<String>>();
         while(scan.hasNext()){
            String name = scan.next();
            Node leftC = new Node(name);
            String date = scan.next();
            Node rightC = new Node(date);
            root.left = leftC;
            root.right = rightC;
            insert(leftC, rightC);
            }
           f.close(); 
        }
// compare method available to user to ensure values are sorted
  public Node compare(Node root, int key){
         if( root.key>key){
            return search(root.left, key);
            }
            return compare(root.right, key);
       }
  
    public static Movie read(Scanner scanner) {
        if (!scanner.hasNext()) return null;
        String[] arr = scanner.next().split(",");
        String temp = "";
        int count = 0;
        int r = 0;
        for(String a: arr){
            //if statement collects name, assuming it comes after the first word and comma
            if(count == 1){name.equals(a);}
            else{
                temp += (a+ " ");
            }
            count++;
        }
        line[r] = temp;
        r++;
        return new Artist(name, line);
    }
    
    private static String name;   
    private static String[] line = new String[10];
    String[] names = new String[10];
    static LinkedList<String> obj = new LinkedList<String>();
    
    public static void main(String[] args) throws Exception{
       PrintWriter artistSort = new PrintWriter("placeholderFile.txt");
       Scanner scanner = new Scanner(new File("movies.csv"));
       Artist artist = read(scanner);
       //this reads in lines through read method, then gets name from getName which goes in the linkedlist
       while(artist != null){
           obj.add(artist.getName());
           artist = read(scanner);
       }
       //sorts the list alphabetically, then prints to a file
       Collections.sort(obj);
       for(String x: obj){
           artistSort.println(x);
       }
       artistSort.close();
       //removes any duplicate elements in linkedlist
       for(int i = 0; i < obj.size(); i++){
           if(i>0 && i <obj.size()){
               if(obj.get(i).equals(obj.get(i-1))){
                   obj.remove(obj.get(i));
                }
            }
       }
       }
 }
