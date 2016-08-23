package songrecord;

/**
 *
 *The code uses PlayList class that stores all SongRecord objects 
 *that belong to a particular playlist
 *
 *@author Nathan Grant
 *
 *email:nathan.grant@stonybrook.edu
 *Stony Brook Id:109816757
 *
 */

public class PlayList extends SongRecord{
    
    
    
    public final static int MAX_R= 50;
    public static SongRecord[] array1=new SongRecord[MAX_R];//Array that holds that objects for songrecord
    public static SongRecord[] array2=new SongRecord[MAX_R];//Array that holds the objects for songrecord when I find the songs for a particular artist
    
    /**
     *
     *Default constructor for SongRecod
     * 
     */
    
    public PlayList(){
        
    }
    
     public PlayList(String title,String artist,int min,int second){
        this.title=title;
        this.artist=artist;
        this.songinM=min;
        this.songinS=second;
    }
    
    /**
     *Returns the number of songrecords in the playlist
     *
     *Precondition:
     *Array has to be instantiated
     *
     *@param capacity:
     *none
     *
     */
    public static int size(){
        
        int length= array1.length;
        int size=0;
        
        for(int i=0;i<length;i++){
             if(array1[i]!=null){
                size++;
             }
             else 
                 break;
        }
        
        return size;
    }
    /**
     *Returns the number of SongRecords in the second array(array2)
     *This array is used to contain the songrecords with the same
     *artists name
     *
     *Precondition:
     *Array has to be instantiated
     *
     *@param capacity:
     *none
     *
     */
    public static int sizeXL(){
        
        int length= array2.length;
        int size2=0;
        
        for(int i=0;i<length;i++){
             if(array2[i]!=null){
                size2++;
             }
             else 
                 break;
        }
        
        return size2;
    }
    
    /**
     *Adds a song to the array1
     *
     *@param capacity:
     *Contains a songrecord and a integer that specifies the position
     *
     *Precondition: 
     *postion has to be greater or equal to zero and between size-1
     *
     *Postcondition:
     *songrecord has been added to the array. If the user puts another
     *record in its place, the previous record will be moved up by one
     *in the array
     *
     *@exception IllegalArgument:
     *Indicates that the number used is invalid
     *
     */
    public void addSong(SongRecord song, int position) throws Exception{
        
        try{
        
         int size=array1.length;
        
        int i=position-1;
        int j= position-1;
        int size2=size();
        
        if(position>=0 && position<size-1){
        
            if(array1[i]!=null){
                
             while(array1[i]!=array1[size2]){
                   
                    array1[i+1]=array1[i];
                    i++;
              }
            }   
            array1[j]=song; 
                
        }

        }
            catch(Exception ex){
            System.out.println("Position is not within valid range");
        }
        
    }

    /**
     *Adds a song to the array2
     *The reason why I made a seperate method is because when I called addSong()
     *in the getSongsByArtist() method, the program for some reason used array1 
     *even when I created a new playlist. So a made a new method
     *
     *@param capacity:
     *Contains a songrecord and a integer that specifies the position
     *
     *Precondition: 
     *postion has to be greater or equal to zero and between size-1
     *
     *Postcondition:
     *songrecord has been added to the array. If the user puts another
     *record in its place, the whole arrray will shift to the right
     *
     *@exception IllegalArgument:
     *Indicates that the number used is invalid
     *
     */
     public void addSongXL(SongRecord song, int position) throws Exception{
        
        try{
        
         int size=array2.length;
        
        int i=position-1;
        int j= position-1;
        int size2=size();
        
        if(position>=0 && position<size-1){
        
            if(array2[i]!=null){
                
             while(array2[i]!=array2[size2]){
                   
                    array2[i+1]=array2[i];
                    i++;
              }
            }   
            array2[j]=song; 
                
        }

        }
            catch(Exception ex){
            System.out.println("Position is not within valid range");
        }
        
    }
     /**
      * Method that clones the PlayList into another Playlist
      * 
      * Precondition:
      * PlayList object has to be instantiated
      *
      * @param: none
      * 
      * @return 
      */
    
    public Object clone(){
        
       PlayList new1= new PlayList();
        String name1= this.getA();
        String name2= this.getT();
        
        int num1= this.getSonginM();
        int num2= this.getSonginS();
        
        int length=size()-1;
        
       
            try {
                
            new1= new PlayList(name2,name1,num1,num2);
            } catch (Exception ex) {
                System.out.println("Arguments Invalid");
        }

            return new1;
    }

    /**
     *Returns a boolean that says whether two Playlist objects
     *are equal to each other
     *
     *Precondition:
     *Object has to be instantiated
     *
     *@param: none
     *
     *
     *@exception IllegalArgument:
     *Indicates that the number used is invalid
     */
   
    public boolean equals (Object obj){
        
        try {
            PlayList num1= (PlayList)obj;
            
            if(obj==null){          
                return false;
            }
            
            int size=size();
            PlayList new1=num1;
            
            
                
                
                if(new1.getA()!=num1.getA() || new1.getSonginM()!=num1.getSonginM() || new1.getSonginS()!=num1.getSonginS()){
                    
                    return false;
                }
              
           
        } catch (Exception ex) {
            System.out.println("Argument Exception");
        }
        return true;
    }
    
    /**
     *Returns the song in the playlist at a given position
     *
     *@param
     *A number that represents the position, the number has to
     *be greater than zero and less than the total number of 
     *songrecord objects in the array
     *
     *
     *PostCondition:
     *returns the songrecord at that position
     *
     *Precondition:
     *The position that is specified has to be lower than the 
     *number of songrecords in the array minus 1 and greater than zero
     *
     *@exception IllegalArgument:Indicates that the number used is invalid
     */
    
    public SongRecord getSong(int position) {
        
        position=position-1;
        
        if(position==0){
            return (SongRecord)array1[position];
        }
        else if(position<0 || position>size()-1){
            throw new IllegalArgumentException("This is not in the playlist");
        }
        else{
           // String num1= array1[position].toString();
            SongRecord num4=new SongRecord();
            num4= (SongRecord)array1[position];
            return num4;
        }
        
    }
    /**
     *Removes the songrecord in the position that the user specifies
     *
     *
     *@param
     *A number that represents the position, the number has to
     *be greater than zero and less than the total number of 
     *songrecord objects in the array minus 1
     *
     *
     *PostCondition:
     *removes the songrecord at that position
     *
     *Precondition:
     *The position that is specified has to be lower than the 
     *number of songrecords in the array and greater than zero
     */
    public void removeSong(int position){
        
            int size=array1.length;
        
        int i=size()-1;
        
        position=position-1;
        
        if(position>=0 && position<=size()-1){
            
               // SongRecord num1=(SongRecord)array1[position];
                
                    array1[position]=null;
                  
                
                    
                    while( position<=i && array1[position+1]!=null){
                    array1[position]=array1[position+1];
                    position++;
                   
              }
                      array1[i]=null;

        }
        
    }
    
    /**
     *prints the number of songs in the array1
     *
     *Precondition:
     *Array has to be instantiated
     *
     *@param capacity:
     *none
     */
    public void printAllSongs(){
        
        int size=size();
        int size2=array1.length;
        int j=1;
        System.out.println("Song#      Title      Artist     Length");
        System.out.println("---------------------------------------");
       
        for(int i=0;i<=size-1;i++){
            
            System.out.print(j+array1[i].toString());
            j++;
            System.out.println("\n");
            
        }
                
        System.out.println(toString());
                
        
    }
    /**
     *Prints the number of songs in the array2
     * 
     *
     *Precondition:
     *Array has to be instantiated
     *
     *@param capacity:
     *none
     */
    
    public void printAllSongsXL(){
        
        int size=sizeXL();
      //  int size2=array2.length;
        int j=1;
        System.out.println("Song#      Title      Artist     Length");
        System.out.println("---------------------------------------");
        
        for(int i=0;i<=size-1;i++){
            
            System.out.print(j+array2[i].toString());
            j++;
            System.out.println("\n");
            
        }
        
    }
    
    /**
     *Returns the songs by a specified artist
     *
     *@param
     *The playlist that contains the songrecords and a string with the artists
     *name
     *
     *PostCondition:
     *Creates another playlist that contains only songrecords made by the artist
     *
     *Precondition:
     *Playlist has to be instantiated
     *
     *@exception IllegalArgument:
     *Indicates that the number used is invalid
     */
    public static PlayList getSongsByArtist( PlayList originalList,String artist) {
        
      //  int i=0;
        
        int size= size();
        PlayList new1= new PlayList();
        SongRecord num2=new SongRecord();
       // PlayList array2=new SongRecord[MAX_R];
             int k=artist.length();
             int j=0;
        boolean choice=true;
        int m=1;
        for(int i=1;i<=size;i++){
             num2= originalList.getSong(i);
            
            String name= num2.getA();
            
            //int size2=name.length();
             
            choice=wordC(artist,name);
               
            
            if(choice==true){
                 try {
                     j++;
                     new1.addSongXL(num2,j);
                     
                 } catch (Exception ex) {
                     System.out.println("Argument not valid");
                 }
            }
        }  
        return new1;  
    }
    
    /**
     *Method that returns whether two strings are the same. This was 
     *used in the getSongsByArtist() method
     *
     *@param
     *Two strings that will be compared to each other
     *
     *PostCondition:
     *none
     *
     *Precondition:
     *returns either true or false depending on whether the strings are equal
     *to eachb other 
     */
    public static boolean wordC(String name1, String name2){
        boolean choice=true;
        
        if(name1.length()!=name2.length()){
            return false;
        }
        else{
            for(int i=0;i<name1.length();i++){
                if(name1.charAt(i)!=name2.charAt(i)){
                    return false;
                }
                else
                    choice=true;
                
            }
        
            }
        if(choice==true)
            return true;
        else
            return false;
    }   
}
