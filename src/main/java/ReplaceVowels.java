import java.util.Arrays;
import java.util.ArrayList;

public class ReplaceVowels {
  public String replaceNothing(String forInputPhrase) {
    String consonants = "b";
    return consonants;
  }

  public String replaceVowels(String forInputPhrase) {
    String vowels = "a";
    return "-";
  }

  public static String replaceAllVowels(String forInputPhrase) {
    String results = "";

    String output = forInputPhrase.replaceAll("[aeiouAEIOU]", "-");
    results = output;
    return results;
  }
}
