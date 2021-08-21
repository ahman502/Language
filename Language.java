/* Languages, just like people, often have families.
You can even map language lineage a bit like a family tree.
Java can help us build a model to track inherited traits across
families. In this case, we’ll focus on something that often varies
between language families: word order — where the subject, verb, and
object would go in a sentence. */

/* A Java program built around Inheritance and Polymorphism to model
real-world Language families. */



public class Language {

  protected String name;
  protected int numSpeakers;
  protected String regionsSpoken;
  protected String wordOrder;

  Language(String n, int nS, String rS, String wO) {

    this.name = n;
    this.numSpeakers = nS;
    this.regionsSpoken = rS;
    this.wordOrder = wO;
  }

  public void getInfo() {
    System.out.println(name + " is spoken by " + numSpeakers + " people mainly in " + regionsSpoken + ". The language follows the word order: " + wordOrder);
  }

  public static void main(String[] args) {

     System.out.println("----- Spanish Language -----");
    Language spanish = new Language("Spanish", 555000000, "Spain, Latin America, and Equatorial Guinea", "subject-verb-object");
    spanish.getInfo();

    System.out.println("\n----- Mayan Language -----");
    Mayan chontal = new Mayan("Chontal", 2330000);
    chontal.getInfo();

    System.out.println("\n----- SinoTibetan Language (Tibetan) -----");
    SinoTibetan tibetic = new SinoTibetan("Tibetan", 2530000);
    tibetic.getInfo();

    System.out.println("\n----- SinoTibetan Language (Chinese) -----");
    SinoTibetan chinese = new SinoTibetan("Chinese", 5500100);
    chinese.getInfo();
  }
}
