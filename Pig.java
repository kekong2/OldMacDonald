class Pig implements Animal//implements Animal 
{     
     //your code here
     private String myType;
     private String mySound;
     public Pig(String type, String sound){
     	myType = type;
     	mySound = sound;
     }
     public String getType(){return myType;}
     public String getSound(){return mySound;}
}
