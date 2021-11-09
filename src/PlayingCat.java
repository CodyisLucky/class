public class PlayingCat {
    // write your code here
    public static boolean isCatPlaying(boolean summer, int temperature){
        if(summer){
            if(temperature <= 45 && temperature >= 25){
                return true;
            }
            return false;
        }
        if(temperature <= 35 && temperature >= 25){
            return true;
        }
        return false;
    }
}