package ex20210909;

import java.util.Scanner;

public class 카카오문제1 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String new_id = sc.next();
      System.out.println(solution(new_id));
   }

   public static String solution(String new_id) {
      String answer = "";
   
      answer = new_id.toLowerCase(); // 1
      //System.out.println(answer);
      answer = answer.replaceAll("[^0-9a-z-_.]", ""); // 2
      //System.out.println(answer);
      answer = answer.replaceAll("[.]{2,}", "."); // 3
      //System.out.println(answer); 
      answer = answer.replaceAll("^[.]|[.]$",""); // 4
      //System.out.println(answer);
      
      if(answer.equals("")) { // 5
         answer+="a";
      }
      if(answer.length() >= 16) { // 6
         answer = answer.substring(0,15);
         if(answer.substring(14,15).equals(".")) {
            answer = answer.replace(answer.substring(14,15), "");
         }
      }
      if(answer.length() <=2 ) { // 7
         while(answer.length() < 3) {
                answer += answer.charAt(answer.length()-1);
            }
      }
      return answer;
   }

}