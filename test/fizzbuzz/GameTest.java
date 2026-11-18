package fizzbuzz;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GameTest {

    Game game;

    @BeforeEach
    void setUp() throws Exception {
        game = new Game();
    }

    @Test
    void firstRoundTest() {
        assertEquals("1", game.next());
    }
    
    @Test
    void firstSecondTest() {
    	game.next();
    	assertEquals("2", game.next());
    }
    
    @Test
    void firstFizzTest() {
    	game.next();
    	game.next();
    	assertEquals("Fizz", game.next());
    }
    
}