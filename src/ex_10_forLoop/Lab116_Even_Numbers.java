package ex_10_forLoop;

public class Lab116_Even_Numbers {
    public static void main(String[] args) {

        for (int i = 3; i <=50 ; i++) {
            if(i%2 ==0 ){
                System.out.println("even -> "+i);
                continue;
            }
            System.out.println(i);
        }


    }

}
