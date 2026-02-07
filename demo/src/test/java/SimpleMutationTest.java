
import org.junit.Before;
import org.junit.Test;

import com.Mutations.Mutations;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

// make sure to use junit 4
public class SimpleMutationTest {
    // We use this variable to capture "System.out" output.
    // Your tests will each run separately, each with their own instance
    // of a `SimpleMutationTest` object
    // thus, we don't need to worry about resetting theirOut in between tests
    private final ByteArrayOutputStream theirOut = new ByteArrayOutputStream();

    // This code will be performed before each of your tests.
    @Before
    public void setUp() throws Exception {
        // Instead of printing your output to a console nobody is watching, we save it
        // into `theirOut` for comparison later
        System.setOut(new PrintStream(theirOut));
    }

    @Test
    public void test() {
        String inputString = "2\n"
                + "askw;4lkw we4 wk;kj\n"
                + "askw;4lK2 we4 w4;kj\n"
                + "arGAEK4we4k4v2 w45W$\n"
                + "argAEK4we4k4w2 w45W$\n";
        String outputString =
                "askw;4lkw we4 wk;kj\n"
                        + "askw;4lK2 we4 w4;kj\n"
                        + ".......**......*...\n"
                        + "\n"
                        + "arGAEK4we4k4v2 w45W$\n"
                        + "argAEK4we4k4w2 w45W$\n"
                        + "..*.........*.......\n"
                        + "\n";
        // since our program expects input on System.in, we populate
        // System.in with the contents of our input string
        System.setIn(new ByteArrayInputStream(inputString.getBytes()));
        Mutations.find();
        // the actual test just compares what we expect the program to output
        // with what the program actually outputted (which is contained inside
        // the theirOut variable)
        assertEquals(outputString, theirOut.toString());
    }

    // TODO: You should add AT LEAST ONE new test of your own
    // -5 points if you do not
}
