
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Main { //the name of your class has to match the name of your file
  public static void main(String[] args) { //for now, we'll put all of ourt coding in the main function.

    int x=10;//declaring an integer, define data type- we are practicing conditional statements
    if (x<10){
      System.out.println("less");
    }
    else if (x>10){
      System.out.println("greater");
    }
    else{
      System.out.println("Equal");
    }
    System.out.println("Hello world!"); 

    int a=0;
      while (a<10){ //this is a while loop that makes the computer type 0-9.
        System.out.println(a);
        a=a+1;
      }


    for (int u=0; u<10;u++) //u++ doesnt have a semicolon because you want it to repeat
      {
        System.out.println(u); // This does the same as line 17-21
      }

    int r=20;
    do{
      System.out.println(r);
      }while(r<10);


    Scanner s=new Scanner(System.in); // this line is creating a new scanner object, one scanner object is good for the whole file. Scanner is input.
    System.out.print("Enter Name");
    String name= s.nextLine(); //This is an input for strings
    System.out.println ("name"+ name);


    int money = 0;
    while (money<100){
      System.out.print("Enter a coin");
      String Amount= s.nextLine();
         if (Amount.equals("Penny")){
          money=money+1;}
         else if (Amount.equals("Nickel")){
          money=money+5;}
         else if (Amount.equals("Dime")){
          money=money+10;}
         else if (Amount.equals("Quarter")){
          money=money+25;}
         else{
           System.out.println("Not valid");

         }

    }

    int Answer=1;
    while (Answer!=14){
      System.out.print("Guess a number.");
      Answer= s.nextInt();
     }

    for (int i=0;i<101;i=i+5){
      System.out.println(i);
    }
    System.out.println();
    for (int v=20;v>0;v=v-2){
      System.out.println(v);
    }

    System.out.println (numb);
    while(!(rps.equals("paper"))){
      System.out.println("rps?");
      rps=s.nextLine();
    }    


    int num=0;
    while (num>=0){
      System.out.println("Enter a number. ");
      num=s.nextInt();


    }

    Scanner s=new Scanner(System.in);
    String rps= " ";
    String comp= ("a");
    int numb= (int)(Math.random()*3+1); //takes a random number from 1-3, you multiply it by the end added to the start.
    if (numb==1){
      comp= "rock";}
    if (numb==2){
      comp= "scissors";}
    if (numb==3){
      comp= "paper";}
    //Write the if statements to compare (7)
    System.out.println ("rps?");
    rps=s.nextLine();
    System.out.println ("The computer chose "+comp+".");
    if (rps.equals ("rock") && comp.equals ("paper")){
      System.out.println ("Computer wins.");
    }
    else if (rps.equals ("paper") && comp.equals ("scissors")){
      System.out.println ("Computer wins.");
    }
    else if (rps.equals ("scissors") && comp.equals ("rock")){
      System.out.println ("Computer wins.");
    }
    else if (rps.equals ("paper") && comp.equals ("rock")){
      System.out.println ("You win.");
    }
    else if (rps.equals ("scissors") && comp.equals ("paper")){
      System.out.println ("You win.");
    }
    else if (rps.equals ("rock") && comp.equals ("scissors")){
      System.out.println ("Computer wins.");
    }
    else if (rps.equals(comp)){
      System.out.println ("Tied.");
    }
    else{
      System.out.print ("Invalid");
    }


    Scanner s= new Scanner (System.in);
    double Money= (10.0);
    double Cost= (0.0);
    System.out.println ("Welcome. Vanilla, strawberry, or chocolate?");
    String flavor= s.nextLine();
    if (flavor.equals ("vanilla")){
      Cost= Cost+4.00;
    }
    else if (flavor.equals("strawberry")){
      Cost= Cost+5.00;
    }
    else if (flavor.equals("chocolate")){
      Cost= Cost+5.50;
    }
    else {
      System.out.println ("invalid");
    }
    System.out.println (Cost);
    System.out.println ("Pick toppings. Sprinkles, syrup, fruit.");
    String toppings= s.nextLine();
    if (toppings.equals ("Sprinkles")){
      Cost=Cost+2.00;
    }
    else if (toppings.equals ("syrup")){
      Cost=Cost+1.50;
    }
    else if (toppings.equals ("fruit")){
      Cost=Cost+2.50;}
    else {
    System.out.println ("invalid");
      }
    System.out.println (Cost);
    System.out.println ("Cup or cone?");
    String Container= s.nextLine();
    if (Container.equals ("cup")){
      Cost=Cost+1.50;
    }
    else if (Container.equals ("cone")){
      Cost=Cost+2.50;
    }
    else{
      System.out.println ("invalid.");
    }
    System.out.println ("Your final price is ");
    System.out.println (Cost);
    if (Cost>Money){ //if the cost is greater than the money, they can't aforrd it.
      System.out.println ("You don't have enough money to buy this.");
    }
    else{
      System.out.println ("Thanks, you have this much left.");
      Money= Money-Cost; 
      System.out.println(Money);
    }

    Scanner s= new Scanner(System.in);
    String S1= ("Jane");
    Double S1GPA= 3.5;
    int S1Absence=2;
    String S2= ("Joe");
    Double S2GPA= 4.0;
    int S2Absence=1;
    String S3= ("Jason");
    Double S3GPA= 2.9;
    int S3Absence=19;
    System.out.println ("Enter student's name.");
    String Student= s.nextLine();
    if (Student.equals ("Jane")){
      if (S1GPA>3.5 && S1Absence<5){
        System.out.println ("You won an award.");
      }
      else{
        System.out.println ("You didn't win an award.");
      }
    }
    else if (Student.equals ("Joe")){
      if (S2GPA>3.5 && S2Absence<5){
          System.out.println ("You won an award.");
        }
        else{
          System.out.println ("You didn't win an award.");
        }
    }
    else if (Student.equals ("Jason")){
      if (S3GPA>3.5 && S3Absence<5){
        System.out.println ("You won an award.");
      }
      else{
        System.out.println ("You didn't win an award.");
        }}
    else{
        System.out.println ("Invalid student name.");
      }

    Scanner l = new Scanner(System.in); 
    System.out.print("Enter a number grade.");
    int number = l.nextInt();
    String grade=("9");

    if (number>=90){
      System.out.println("A");
      grade = ("A");
    }
    else if (number>=80 && number<90){
        System.out.println("B");
      grade = ("B");
    }
    else if (number>=70 && number<80){
      System.out.println("C");
      grade = ("C");
    }
    else if (number>=60 && number<70){
      System.out.println("D");
      grade = ("D");
    }
    else {
      System.out.println("F");
      grade = ("F");

    }
    if (grade.equals("F") || grade.equals("D")){
      System.out.println ("You don't get to graduate");
    }
    else if (grade.equals("A")|| grade.equals("B")){
      System.out.println("You get to graduate");
    }

    else{
      System.out.println("You're cooked.");
    }
/*
    System.out.print ("enter an age.");
    int age = l.nextInt();
    String ticket="";

    if (age<=12){
      System.out.print ("Children ticket");
      ticket=("Children ticket");
    }
    else if (age>12 && age<18){
      System.out.print ("Teenager ticket");
      ticket=("Teenager ticket");
    }
    else if (age>17){
      System.out.print ("Adult ticket");
      ticket=("Adult ticket");
    }
    if (ticket.equals("Children ticket")){
      System.out.print ("Your price is $10");
    }
    else if (ticket.equals("Teenager ticket")){
      System.out.print ("Your price is $15");
    }
    else {
      System.out.print ("Your price is $20");
    }







  String[] capricorn= {"Annoying", "Loud", "Anger issues"};
  String[] aquarius= {"Amazing", "Smart", "Creative"};
  String[] pisces= {"Sensitive", "Intuitive", "Empathetic"};
  String[] aries= {"Stubborn", "carefree", "brave"};
  String[] taurus= {"dedicated", "Loud", "Anger issues"};
  String[] gemini= {"communative", "intellectual", "Curioud"};
  String[] cancer= {"sentimental", "emotional", "compassionate"};
  String[] leo= {"hardworking", "confident", "loyal"};
  String[] virgo= {"analytical", "judgy", "detail-oriented"};  
  String[] libra= {"creative", "idealistic", "Commitment issues"};
  String[] scorpio= {"determined", "idealistic", "compassionate"};
  String[] saggitarius= {"inconsistent", "conan gray", "free spirited"};

//make a scanner and ask what sign, create random number generator//
  String[] stringlist={"word","work","worm"};
  Scanner l = new Scanner(System.in); 
  System.out.print("What is your sign?");
  String sign= l.nextLine();
  int randomnumber= (int)(Math.random()*2+0);

  if (sign.equals("capricorn")){
    System.out.println("you are " + capricorn[randomnumber]);
  }
  if (sign.equals("aquarius")){
    System.out.println("you are " + aquarius[randomnumber]);
  }
  if (sign.equals("pisces")){
    System.out.println("you are " + pisces[randomnumber]);
  }
  if (sign.equals("aries")){
    System.out.println("you are " + aries[randomnumber]);
  }
  if (sign.equals("taurus")){
    System.out.println("you are " + taurus[randomnumber]);
  }
  if (sign.equals("gemini")){
    System.out.println("you are " + gemini[randomnumber]);
  }
  if (sign.equals("cancer")){
    System.out.println("you are " + cancer[randomnumber]);
  }
  if (sign.equals("leo")){
    System.out.println("you are " + leo[randomnumber]);
  }
  if (sign.equals("virgo")){
    System.out.println("you are " + virgo[randomnumber]);
  }
  if (sign.equals("libra")){
    System.out.println("you are " + libra[randomnumber]);
  }
  if (sign.equals("scorpio")){
    System.out.println("you are " + scorpio[randomnumber]);
  }
  if (sign.equals("saggitarius")){
    System.out.println("you are " + saggitarius[randomnumber]);
  }
  Scanner b= new Scanner(System.in);
  System.out.print("What is the month of ur birthday?");
  int birthmonth=b.nextInt();

  System.out.print("What is the date of ur birthday?");
  int birthday=b.nextInt();

  if ((birthmonth == 3 && birthday>=21 && birthday<=31) || (birthmonth == 4 && birthday<=19)){
    System.out.print("You are an aries.");
  }
  else if ((birthmonth == 4 && birthday>=20 && birthday<=30) || (birthmonth == 5 && birthday<=20)){
    System.out.print("You are a Taurus.");
  }
  else if ((birthmonth == 5 && birthday>=21 && birthday<=31) || (birthmonth == 6 && birthday<=21)){
    System.out.print("You are a gemini.");
  }
  else if ((birthmonth == 6 && birthday>=22 && birthday<=30) || (birthmonth == 7 && birthday<=22)){
    System.out.print("You are a cancer.");
  }
  else if ((birthmonth == 7 && birthday>=23 && birthday<=31) || (birthmonth == 8 && birthday<=22)){
    System.out.print("You are an leo.");
  }
 else if ((birthmonth == 8 && birthday>=23 && birthday<=30) || (birthmonth == 9 && birthday<=22)){
    System.out.print("You are a virgo.");
  }
  else if ((birthmonth == 9 && birthday>=23 && birthday<=31) || (birthmonth == 10 && birthday<=22)){
      System.out.print("You are a libra.");
  }
 else if ((birthmonth == 10 && birthday>=23 && birthday<=30) || (birthmonth == 11 && birthday<=22)){
      System.out.print("You are a scorpio.");
  }
  else if ((birthmonth == 11 && birthday>=22 && birthday<=31) || (birthmonth == 12 && birthday<=22)){
      System.out.print("You are a Saggitarius.");
    }
  else if ((birthmonth == 12 && birthday>=22 && birthday<=30) || (birthmonth == 1 && birthday<=19)){
      System.out.print("You are a Capricorn.");
    }
  else if ((birthmonth == 1 && birthday>=20 && birthday<=31) || (birthmonth == 2 && birthday<=18)){
      System.out.print("You are a Aquarius.");
    }
  else if ((birthmonth == 2 && birthday>=19 && birthday<=29) || (birthmonth == 3 && birthday<=20)){
      System.out.print("You are a Pisces.");
    }
  else{
    System.out.println("Incorrect birthday, please try again.");
  }


  List<String> gift= Arrays.asList (new String[]{"rock", "purse", "violin", "plant", "book", "Gift card", "Kanye West" });
  String[] people= {"Player 1", "Player 2", "Player 3", "Player 4", "Player 5", "Player 6", "Player 7"};
  String currentplayer= "Player 1";
  List<String> opened= new ArrayList<String>();
  System.out.println ("Welcome to the white elephant gift exchange. When its your turn, you can either pick or steal.");
  System.out.println ("Because you're the first player, you have to pick.");
  int randomnumber= (int)(Math.random()*6+0);
  String choice=gift.get(randomnumber);
  System.out.println ("You got "+ choice);
  opened.add (choice);
  //boolean removed=gift.remove (choice);//
  System.out.print (opened);
  //System.out.print (removed);
  System.out.println("This is the second person's turn.");  
  Scanner l = new Scanner(System.in); 
  System.out.print("Pick or steal?");
  String ps= l.nextLine();
  if (ps.equals("Pick")){
    randomnumber= (int)(Math.random()*6+0);
    choice=gift.get(randomnumber);
    System.out.println ("You got "+ choice);
  }
  else{
    System.out.println("These are the opened ones.");
    System.out.println(opened);
    ps=l.nextLine();
  }







  }


}  