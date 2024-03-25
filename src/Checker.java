public class Checker {
    public static boolean check_length(Flower[] flowers){
        boolean flag= flowers[flowers.length - 1] == null;
        return flag;}
        public static int getPosition(Flower[] flowers){
            int position = 0;

            for(int i=0;i<flowers.length; i++){
                if(flowers[i] == null) {
                    position=i;
                    break;}

            }
            return position;

    }
}
