package programmers;

public class test {

    public static void main(String[] args) {

        int i = 0;
        int sum = 0;
        while(i<10){
            i++;
            if(i%2==1)
                continue;
            System.out.println("i = " + i);
            sum += i;

        }
        System.out.println("sum = " + sum);
    }
}
