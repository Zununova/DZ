public class Main {
    public static void main(String[] args) {

        int a = genereteRandomAge();
        System.out.println(vod (a,20));
        System.out.println(vod(a,-40));
        System.out.println(vod(a,45));
        System.out.println(vod(a,10));
        System.out.println(vod (a,0));
    }
    public static int genereteRandomAge(){
        int age = (int) (Math.random()*100);
        return age ;
    }
    public static String vod (int age, int temperature) {
        if (age > 20 && age < 40 && temperature > -20 && temperature < 30) {
            return "Можно идти гулять";
        } else if (age < 20 && temperature > 0 && temperature < 25) {
            return "Можно идти гулять";
        } else if (age > 45 && temperature > -10 && temperature < 25) {
            return "Можно идти гулять";

        } else {
            return "Не выходить";
        }
    }
}