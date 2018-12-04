class Chick implements Animal//implements Animal 
{     
     //your code here
     private String myType;
     private String mySound;
     private String myOtherSound;
     public Chick(String type, String sound){
     	myType = type;
     	mySound = sound;
     }
     public Chick(String type, String sound, String otherSound){
     	myType = type;
     	mySound = sound;
     	myOtherSound = otherSound;
     }
     public String getType(){return myType;}
     public String getSound(){return mySound;}
}
