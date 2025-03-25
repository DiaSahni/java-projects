
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Main { //the name of your class has to match the name of your file
  public static void main(String[] args) { 
    String[] MovieList={"Batman", "Spiderman", "Antman", "Deadpool","barbie"};
    double[] MovieTime={1.30, 2.00, 5.30, 6.00, 8.00, 9.00};
    String[] SeatChoices={"X","X","X","X", "X", "O", "X"};

    for (int l=0; l<MovieList.length; l++){ // we are printing each of the movie titles from the movie list
      System.out.println (MovieList[l]);
    }
    Scanner j=new Scanner(System.in); //make scanner to ask and get what the person wants
    System.out.print("Which movie do you want to watch?");
    String  Movie= j.nextLine();


    boolean MovieCorrections = false;
    
    for (String element: MovieList){ //checking if the answer is valid to the list.
      if (element.equals(Movie)){

        MovieCorrections= true;
        


        for (int a=0; a<MovieList.length; a++){
          System.out.println (MovieTime[a]);
          System.out.println ();
        }
        System.out.print("WHAT time do u want to watch the movie?");
        System.out.println();
        String Time= j.nextLine(); // using scanner to check the timing info.

        
        for (int u=0; u<SeatChoices.length; u++){
          System.out.print(SeatChoices[u]);
        }
        System.out.println();
        System.out.println ("What seats do you want? X means available.");
        System.out.println ();
        String seat = j.nextLine();
        if (seat=="6"){
          System.out.println ("That's already taken");
        }
        else{ //meaning their seat is availible
          System.out.println("Adult ticket or child ticket?");
          String AgePrices = j.nextLine();
          if (AgePrices.equals ("Adult")){
            if (Time=="2.0" || Time=="1.30"){
              System.out.println("You get a discount :) Your price is $7");
            }
            else{
            System.out.println("Your price is $9"); 
            }
          } //This is the end of the adult section
            
          else{
            if (Time.equals("2.0") || Time.equals("1.30")){
              System.out.println("You get a discount; your price is $4.50");
            }
            else{
              System.out.println("Your price is $6");
            }
          }
          System.out.println ("Your tickets are confirmed: "+ Movie + (" at ") + Time + " in seat " + seat +".");
        }


        
      }
    } 
    if (MovieCorrections==false){ // We dont care if it doesnt fit all of the movies, it just has to fit one without giving an invalid. Because we don't need to check if it's correct 5 times, just once after the for loop is done.
        System.out.println("Well actually, according to my calculations, that is not a valid answer🤓☝️");
        
    }

      
        
        



        
    
    


  }
    


}



