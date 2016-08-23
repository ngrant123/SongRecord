package songrecord;

/**
 *This code contains information about a particular file
 *the title, artist, minutes and seconds are available
 * 
 *  @author nathangrant
 * 
 * email:nathan.grant@stonybrook.edu
 * Stony Brook Id: 109816757
 */



public class SongRecord{
    
    
    public String title;
    public String artist;
    
    public int songinM;//song in mins
    public int songinS;// song in seconds
    
    /**
     *
     *Default constructor for SongRecod
     * 
     */
    
    public SongRecord(){
        
        
    }
    
    public SongRecord(String title,String artist,int min,int second){
        this.title=title;
        this.artist=artist;
        this.songinM=min;
        this.songinS=second;
    }
    
    /**
     *Method that allows the user to get the title
     *of the song from the program
     *
     */
    public String getT(){
        return this.title;
    }
    
    /**
     *
     *Method that allows the user to get the 
     *artist that made the song
     *
     */
    
    public String getA(){
        return this.artist;
    }
    
    /**
     *Gets the length of the second in minutes
     */
    
    public int getSonginM(){
        return this.songinM;
    }
    /**
     *Gets the length of the second in seconds
     */
    public int getSonginS(){
        
        return this.songinS;
    }
    
    /**
     *
     *Sets the title for this songs
     *
     *@param:
     *The title of the song that the user wants
     *to set it to
     *
     */
    public void setT(String title2){
        
        this.title=title2;
    }
    
    /**
     *Sets the artist for the song that the user wants
     *
     *@param:
     *The artist that the user wants to set it to
     *
     */
    
    public void setA(String artist2){
        this.artist=artist2;
    }
    
    /**
     *
     *Sets the length of the song in minutes
     *
     *@param:
     *The amount of minutes that the song is
     *
     *Prencondition:
     *The minutes must be greater than zero. It can not
     *be negative
     *
     *@exception IllegalArgumentException
     *Means that the min is less than zero
     */
    public void setM(int min)throws Exception{
        
        
        if(min<0)
            throw new IllegalArgumentException("Negative is not allowed");
        
        this.songinM=min;
    }
    
    /**
     *Sets the length of the song in seconds
     *
     *@param:
     *The amount of seconds that the song is
     *
     *Prencondition:
     *The seconds must be greater than zero and less than 59. It can not
     *be negative
     *
     *@exception IllegalArgumentException
     *Means that the min is less than zero  
     */
    public void setS(int sec) throws Exception{
        
        if(sec<0 || sec>59)
            throw new IllegalArgumentException("This is not in the bounds ");
        
        this.songinS=sec;
           
    }
    
    /**
     *
     *Method that provides all of the information that is given 
     *from the user in this class 
     */
    
    public String toString(){
        String word= "          "+this.title+"       "+this.artist+ "           "+ this.songinM+" :"+this.songinS;
        return word;
    }
    
}