public class ConstructorDay2 {
    public static void main(String[] args) {
        Piano Pianist=new Piano();
        String brandName= "Yamaha";
        int pinCode= 3643;
        String pianistName= "Mozart";
        byte setAutoMusic= 100;
        Pianist.electricKeyboard();
        Pianist.electricKeyboard(3643);
        Pianist.electricKeyboard("Yamaha");
        Pianist.electricKeyboard("Mozart", setAutoMusic );



    }
}
    class Piano{

     void electricKeyboard (){
         System.out.println("Musician can play piano  ");
     }
     void electricKeyboard(String brandName){
         System.out.println("The Brand Name of the Keyboard is: "+brandName);
     }
     void electricKeyboard (int pinCode ){
         System.out.println("You can use the pin number to unlock the keyboard  " +pinCode);
     }
     void electricKeyboard (String pianistName, byte setAutoMusic){
         System.out.println("Pianist " +pianistName+ " can set auto music for " +setAutoMusic+ " number of songs");
     }

    }

