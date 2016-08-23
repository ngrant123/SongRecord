
package songrecord;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PlayListOperations{
    
    
    public static void main(String []args){
        
        
       PlayList name1= new PlayList("Bob","Bob",1,24);
       // PlayList name2= new PlayList("Bob","Bob",1,24);
          
          SongRecord name3= (SongRecord) name1.clone();
          
        //  System.out.println(name3.toString());
         // boolean name= name1.equals(name2);
         // System.out.println(name1.equals(name2));
        try {
            
            boolean choice=false;
            Scanner input= new Scanner(System.in);
            
            PlayList num1= new PlayList();
         while(choice!=true){  
            System.out.println("Add song:              A   <Title> <Artist> <Minutes> <Seconds> <Position>");
            System.out.println("Get song:              G   <Position>");
            System.out.println("Remove song:           R   <Position>");
            System.out.println("Print all songs:       P");
            System.out.println("Print songs by artist  B   <Artist>");
            System.out.println("Size:                  S");
            System.out.println("Quit:                  Q");
           
            System.out.println("Select an option\n");
            String letter = input.next();
            
               
          switch(letter){
                
                case "A":
                    
                    PlayList num2=new PlayList();
                    System.out.println("Enter the song title:");
                    String  title= input.next();
                    
                    num2.setT(title);
                    
                    
                    System.out.println("Enter the song artist:");
                    String artist= input.next();                    num2.setA(artist);
                    
                    
                    System.out.println("Enter the song length (minutes):");
                    int minutes=input.nextInt();
                    num2.setM(minutes);
                    
                    
                    System.out.println("Enter the song length (seconds)");
                    int seconds=input.nextInt();
                    num2.setS(seconds);
                    
                    
                   
                    System.out.println("Enter the position");
                    int position=input.nextInt();
                    

                    num1.addSong(num2,position);
                    
                    System.out.println("Song added: "+title + " by "+ artist);
                    break;
                    
                case "B":
                    PlayList num3=new PlayList();
                    
                    

                    System.out.println("Enter the artist");
                    String artist1=input.next();
                   
                    num3.getSongsByArtist(num1,artist1);
                    num3.printAllSongsXL();
                    break;
                    
                case "G":
                    System.out.println("Enter the position");
                    int position2= input.nextInt();
                     
                    
                    System.out.println(num1.getSong(position2));
                    break;
                    
                case "R":
                    System.out.println("Enter the position");
                    int position3= input.nextInt();
                    
                    num1.removeSong(position3);
                    System.out.println("Song removed at position "+position3);
                    
                    break;
                case "P":
                    
                    num1.printAllSongs();
                    break;
                    
                case "S":
                    
                    System.out.println("There are "+num1.size()+ " song(s) in the current playlist");
                    break;
                    
                case "Q":
                    choice=true;
                    
                    break;
                    
                    
                default: 
                    System.out.println("This was not one of the options");
                    break;
                    
                }

            }
        } catch (Exception ex) {
            System.out.println("Error with the arguments used");
        }

    }  
    
}