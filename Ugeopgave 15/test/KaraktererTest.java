import org.junit.Test;

import static org.junit.Assert.assertEquals;


class KaraktererTest {

  @Test
  public void karakter() {
    //Arrange
    Karakterer karakterer = new Karakterer();
    // Act
      int actual = 6;
      int expected = 6;
      // Assert
      assertEquals(expected, actual);
    }
  }
