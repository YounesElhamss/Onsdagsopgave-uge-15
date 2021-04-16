import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

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
