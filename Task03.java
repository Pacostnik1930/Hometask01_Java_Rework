// 3. Дан массив nums = [3,2,2,3] и число val = 3.
// Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
// Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного, а остальные - равны ему.
import java.util.Scanner;
import java.util.Arrays;
public class Task03 {
   public static void main(String[] args){
       System.out.println("Введите значение массива :");
       int[] numbs = new int[4];
       Scanner sc = new Scanner(System.in);
       for (int i = 0; i < numbs.length; i++) {

           numbs[i] = sc.nextInt();
       }
       int val = 3;
       int a = numbs.length - 1;
       for (int i = 0; i < numbs.length / 2; i++) {
           if(numbs[i] == numbs[a]){
               a --;
           }
           int c = numbs[i];
           numbs[i] = numbs[a];
           numbs[a] = c;
           
       }
       a -= 1;
   System.out.println(Arrays.toString(numbs));

   }
}
   

