import org.junit.*;
import static org.junit.Assert.*;

public class ReplaceVowelsTest {

  @Test
  public void replaceNothing_inTheCaseOfConsonants_b() {
    ReplaceVowels replaceVowels = new ReplaceVowels();
    assertEquals("b", replaceVowels.replaceNothing("b"));
  }

  @Test
  public void replaceVowels_ifLetterIsVowel_a() {
    ReplaceVowels replaceVowels = new ReplaceVowels();
    assertEquals("-", replaceVowels.replaceVowels("a"));
  }

  @Test
  public void replaceAllVowels_allVowelsInAWord_cauliflower() {
    ReplaceVowels replaceVowels = new ReplaceVowels();
    assertEquals("c--l-fl-w-r", replaceVowels.replaceAllVowels("cauliflower"));
  }

  @Test
  public void replaceAllVowels_phraseIsMultipleWords_afriendlymouse() {
    ReplaceVowels replaceVowels = new ReplaceVowels();
    assertEquals("- fr--ndly m--s-", replaceVowels.replaceAllVowels("a friendly mouse"));
  }


}
