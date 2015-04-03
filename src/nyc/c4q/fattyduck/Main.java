package nyc.c4q.fattyduck;
import java.util.HashSet;
public class Main {

    public static void main(String[] args) {
	// write your code here
        HashSet<Integer> odd=new HashSet<Integer>();
        HashSet<Integer> even= new HashSet<Integer>();
        for (int i=1;i<10;i+=2){
            odd.add(i);
        }
        for (int i=2;i<=10;i+=2){
            even.add(i);
        }
        HashSet<Integer> odd2 = new HashSet<Integer>(odd);
        for (Integer num : even){
            System.out.println(num);
        }
        System.out.println(odd.equals(odd2));

    }
}
