import java.util.HashMap;
/**
 * Class Room - a room in an adventure game.
 *
 * This class is part of the "World of Zuul" application. 
 * "World of Zuul" is a very simple, text based adventure game.  
 *
 * A "Room" represents one location in the scenery of the game.  It is 
 * connected to other rooms via exits.  The exits are labelled north, 
 * east, south, west.  For each direction, the room stores a reference
 * to the neighboring room, or null if there is no exit in that direction.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 2016.02.29
 */
public class Room 
{
    private String description;
    private HashMap<String,Room>exits; //private Room northExit;
    private Room southExit;
    private Room eastExit;
    private Room westExit;

    /**
     * Create a room described "description". Initially, it has
     * no exits. "description" is something like "a kitchen" or
     * "an open court yard".
     * @param description The room's description.
     */
    public Room(String description) 
    {
        this.description = description;
        exits = new HashMap<String,Room>();
        this.exits = new HashMap<>();
    }

    public Room getExit(String direction){
        Room nextRoom = exits.get(direction);
        return nextRoom;
        /*
        if(direction.equals("north")) {
            nextRoom = northExit;
        }
        if(direction.equals("east")) {
            nextRoom = eastExit;
        }
        if(direction.equals("south")) {
            nextRoom = southExit;
        }
        if(direction.equals("west")) {
            nextRoom = westExit;
        }*/
    }
    public String getLongDescription(){
        //String exitString = "You are" + description + "\n" + getExitString();
        return "You are" + description + "\n" + getExitString();
    }
    
    /** * Return a description of the room’s exits,
    * for example, "Exits: north west".
    * @return A description of the available exits.
    */
    public String getExitString() {
        String exitString = "You are " + description;
        exitString = exitString + "\nExits: ";
        
       for(String direction : exits.keySet()){
           exitString += direction;
        }
        return exitString;
        /*
        if(!northExit.equals(null)) {
            exitString += "north ";
        }    
        if(!eastExit.equals(null)) {
            exitString += "east ";
        }
        if(!southExit.equals(null)) {
            exitString += "south ";
        }
        if(!westExit.equals(null)) {
            exitString += "west ";
        }
        */
    }
    
    /**
     * Define the exits of this room.  Every direction either leads
     * to another room or is null (no exit there).
     * @param north The north exit.
     * @param east The east east.
     * @param south The south exit.
     * @param west The west exit.
     */
    public void setExit(Room north, Room east, Room south, Room west) 
    {
        //(String direction, Room neighbor)
        if(north != null) {
            //northExit = north;
           exits.put("north",north);
        }
        if(east != null) {
            //eastExit = east;
            exits.put("east",east);
        }
        if(south != null) {
            //southExit = south;
            exits.put("south",south);
        }
        if(west != null) {
            //westExit = west;
            exits.put("west",west);
        }
    }
//public void setExits
    
    /**
     * @return The description of the room.
     */
    public String getDescription()
    {
        return description;
    }

}
//not gonna lie, I haven't been in class for a whileeee so I know nothing of 
//what we are doing :) Hopefully by the end of next week I will understand
//the concept better. For now I'm not ready to tackle this..I'll just follow along.
