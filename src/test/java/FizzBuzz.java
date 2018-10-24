import org.junit.Test;

/**
 * Date2018/10/24
 * Author:Owen
 * Desc:
 */
public class FizzBuzz {

    @Test
    public  void test1(){
       for (int i=1;i<=100;i++){
           if (i%3==0&&i%5==0){
               System.out.println("FizzBuzz");
              continue;
           }
           if (i%3==0){
               System.out.println("Fizz");
               continue;
           }
           if (i%5==0){
               System.out.println("Buzz");
               continue;
           } else{
               System.out.println(i);}
       }
    }

  @Test
  public void test2(){
      for (int i=1;i<=100;i++){
          if ((i%3==0||(i+"").contains("3"))&&(i%5==0||(i+"").contains("5"))){
              System.out.println("FizzBuzz");
              continue;
          }
          if (i%3==0||(i+"").contains("3")){
              System.out.println("Fizz");
              continue;
          }
          if (i%5==0||(i+"").contains("5")){
              System.out.println("Buzz");
              continue;
          } else {
              System.out.println(i);}
      }

  }

}
