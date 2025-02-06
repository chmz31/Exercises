package Summary_OOP;

 class Naya extends Person implements IGame {
     @Override
     void sanguineType(){
         System.out.println("Naya sanguine type is A-");
     }

     public void play(){
         System.out.println("Naya likes to play League of Legends");
     }

 }