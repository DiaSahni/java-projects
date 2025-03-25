import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
  
    Scanner s=new Scanner(System.in);
    Map <Integer, String> list = new HashMap<Integer, String>();
    list.put(4, " Apples");
    list.put(3, " Bananas");
    list.put(7, " Oranges");
    /*
    for (Map.Entry<Integer,String> e:
    list.entrySet()){
      System.out.println(e.getKey()+e.getValue ());
    }
    
    
    Map <Double, String> recipe = new HashMap <Double, String>();


    Scanner s=new Scanner(System.in);
    System.out.print("How many cookies do you want to make?"); //default is 48
    Double amount= s.nextDouble(); 

  
    recipe.put(2.75*(amount/48.0)," cups all purpose flour");
    recipe.put(1.02*(amount/48.0)," tsp baking soda");
    recipe.put(0.5*(amount/48.0)," TSP BAKING POWDER");
    recipe.put(1.001*(amount/48.0)," cup butter");
    recipe.put(1.5*(amount/48.0)," white sugar");
    recipe.put(1.01*(amount/48.0)," eg");
    recipe.put(1.0*(amount/48.0),"vanilla extract");

    System.out.println("This is your modified recipe.");
    for (Map.Entry<Double,String> e:
    recipe.entrySet()){
      System.out.println(e.getKey()+e.getValue ());

    Map <String, Integer> Report = new HashMap <String, Integer>();
    Report.put("Math",92);
    Report.put("Science",33);
    Report.put("History",97);
    Report.put("English",100);
    Report.put("Spanish",100);
    Report.put("Orchestra",99);

    System.out.println("Do you want to see your whole report or just one?");
    String Answer= s.nextLine();
    if (Answer.equals ("whole report")){
      for (Map.Entry<String,Integer> e: Report.entrySet()){
        System.out.println(e.getKey()+e.getValue());
      }
    }
    
  }


//make a new hashmap and think of 2 things we can put inside it//


  
}