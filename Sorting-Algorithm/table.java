import java.util.Random;
import java.util.Scanner;

public class table {

  Scanner sc = new Scanner(System.in);
  String story;
  String name;
  String adjective1;
  String adjective2;
  String noun1;
  String noun2;
  String noun3;
  String adverb;
  String randomNums;
  Random rand = new Random();

  // getters
  public String getStory() {
    return story;
  }

  public String getName() {
    return name;
  }

  public String getAdjective1() {
    return adjective1;
  }

  public String getAdjective2() {
    return adjective2;
  }

  public String getNoun1() {
    return noun1;
  }

  public String getNoun2() {
    return noun2;
  }
  
  public String getNoun3() {
    return noun3;
  }

  public String getAdverb() {
    return adverb;
  }

  public String getRandomNums() {
    return randomNums;
  }

  // setters
  public void setStory(String newStory) {
    this.story = newStory;
  }

  public void setName(String newName) {
    this.name = newName;
  }

  public void setAdj1(String newAdj1) {
    this.adjective1 = newAdj1;
  }

  public void setAdj2(String newAdj2) {
    this.adjective2 = newAdj2;
  }

  public void setNoun1(String newNoun1) {
    this.noun1 = newNoun1;
  }

  public void setNoun2(String newNoun2) {
    this.noun2 = newNoun2;
  }

  public void setNoun3(String newName3){
    this.noun3 = newName3;
  }

  public void setAdv(String newAdv) {
    this.adverb = newAdv;
  }

  public void setRandom(String newRandom) {
    this.randomNums = newRandom;
  }

  public void putTogetherStory() {
    String story = "Alice and his best fiend " + getName() + "went to disney world today! " + "They saw a "
        + getNoun1() + " in a show at the magic kingdom" + " and ate a " + getAdjective1()
        + "feast for dinner. The next day I " + " ran" + getAdverb() + "to meet mickey mouse in his " + getNoun2()
        + "and then that night i gazed at the " + getRandomNums() + " " + getAdjective2()
        + "fireworks shooting from the " + getNoun3() + ".";
    setStory(story);
  }

  public static void printInstructions() {
    System.out.println("Welcome to the madLabs game. if you type in" +
        "Words, we'll give you a story. start by typing in name");
  }

  public static void main(String[] args) {
    table game = new table();
    game.printInstructions();
  }
}
