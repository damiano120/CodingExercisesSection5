public class BarkingDog {

    // Wstań w określonych godzinach nocnych kiedy szczeka pies.

    public static boolean bark(boolean barking, int hourOfDay){

        if(barking && ((hourOfDay>=0 && hourOfDay<8) || (hourOfDay>22 && hourOfDay<=24)))
            return true;
        else if(!barking && hourOfDay>0 && hourOfDay<8 || hourOfDay>22 && hourOfDay<=24 )
            return false;
        else if(!barking && hourOfDay>7 && hourOfDay<22)
            return false;
        else
            return false;
    }

}