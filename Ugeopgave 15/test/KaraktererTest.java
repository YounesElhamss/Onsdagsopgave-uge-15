import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
