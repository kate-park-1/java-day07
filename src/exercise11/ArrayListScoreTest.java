package exercise11;

import java.util.*;

public class ArrayListScoreTest {
  public static void main(String[] args) {
    List<Integer> scores = new ArrayList<>();
    Scanner in = new Scanner(System.in);
    Integer score;

    while(true){
      try {
        System.out.print("학생의 점수를 입력하세요. 종료하려면 음수 값을 입력하세요 : ");
        score = in.nextInt();
        if(score < 0)
          break;
        else{
          scores.add(score);
        }
      } catch (InputMismatchException e) {
        System.out.println(e.getMessage());
      }
    }
    System.out.printf("전체 학생은 %d 명이다.",scores.size());
    System.out.println("학생들의 성적 : " + scores);

    int max = Collections.max(scores);
    Collections.rotate(scores,1);
    for (int i = 0; i < scores.size(); i++) {
      score = scores.get(i);
      if (score <= max && score >= (max - 10))
        System.out.printf("%d 번 학생의 성적은 %d이며 등급은 A이다. \n", i, score);
      else if (score < max-10 && score >= (max - 20))
        System.out.printf("%d 번 학생의 성적은 %d이며 등급은 B이다. \n", i, score);
      else if (score < max-20 && score >= (max - 30))
        System.out.printf("%d 번 학생의 성적은 %d이며 등급은 C이다. \n", i, score);
      else System.out.printf("%d 번 학생의 성적은 %d이며 등급은 F이다. \n", i, score);
    }
  }
}
