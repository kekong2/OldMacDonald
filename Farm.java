 class Farm 
{     
   //your code here
   private Animal[] aBunchOfAnimals;
   public Farm(){
   	  aBunchOfAnimals = new Animal[4];
   	  aBunchOfAnimals[0] = new Cow("cow", "moo");
   	  aBunchOfAnimals[1] = new Chick("chick", "cluck");
   	  aBunchOfAnimals[2] = new Pig("pig", "oink");
   	  aBunchOfAnimals[3] = new NamedCow("cow", "moo", "Bessie");
   }
   public void animalSounds(){
   	  for (int i = 0; i < aBunchOfAnimals.length; i++){
   	  	  System.out.println(aBunchOfAnimals[i].getType() + " goes " + aBunchOfAnimals[i].getSound());
      }
      System.out.println("The cow is known as: " + ((NamedCow)aBunchOfAnimals[3]).getName());
   }
}
