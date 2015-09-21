import java.util.Scanner;
public class madlib {
	public static void main(String args[]){
   Scanner input = new Scanner (System.in);

   
   String askAdj = "Enter Adjective: ";
   System.out.println(askAdj);
   String Adj = input.nextLine(); 
   
   
   String askName = "Enter Italian Persons name: ";
   System.out.println(askName);
   String Name = input.nextLine(); 
   
   
   String askOcc = "Enter Occupation: ";
   System.out.println(askOcc);
   String Occ = input.nextLine();
   
   String askVerb = "Enter Verb Ending with ING: ";
   System.out.println(askVerb);
   String Verb = input.nextLine();
   
   String askPlant = "Enter Plant (Plural): ";
   System.out.println(askPlant);
   String Plant = input.nextLine();
   
   String askAdj2 = "Enter Adjective: ";
    System.out.println(askAdj);
   String Adj2 = input.nextLine();
   
   String askNoun = "Enter Plural Noun: ";
    System.out.println(askNoun);
   String Noun = input.nextLine();
   
   String askNoun2 = "Enter Noun: ";
    System.out.println(askNoun2);
   String Noun2 = input.nextLine();
   
   String askName2 = "Enter Name: ";
    System.out.println(askName2);
   String Name2 = input.nextLine();
   
   

   System.out.print(Adj + Name + " Brothers is a popular video game where you control a/an " + Occ + " as he/she runs through levels " +  Verb + " on enemies and eating " + Plant + " to get " + Adj2 + " and fireflowers so that he/she can throw " + Noun +  " at enemies. He does all this to save the " + Noun2 + " from the evil " + Name2);
      }
   }
