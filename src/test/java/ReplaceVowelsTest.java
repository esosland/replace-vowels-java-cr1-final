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

}
