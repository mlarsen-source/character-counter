import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class CharacterFrequencyCounterTest 
{

  @Test
  public void textLAppearsThreeTimesinHelloWorld()
  {
    // Arrange
    CharacterFrequencyCounter counter =new CharacterFrequencyCounter("Hello World");

    // Act
    int actualCount = counter.getFrequency('l');
    
    // Assert
    assertEquals(3, actualCount);

  }


  @Test
  public void testNonOccuringCharactersPerentage()
  {
    // Arrange
    CharacterFrequencyCounter counter =new CharacterFrequencyCounter("hi there");

    // Act
  double actualPercentaget = counter.getRelativePercentage('z');
    
    // Assert
    assertEquals(0.0, actualPercentaget, 0.0001);

  }

}