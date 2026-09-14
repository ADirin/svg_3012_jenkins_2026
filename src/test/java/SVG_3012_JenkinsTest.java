import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SVG_3012_JenkinsTest {

    private static final double DELTA = 0.0001;

    // ---------- validateInput ----------

    @Test
    void validateInput_acceptsPositiveValues() {
        assertDoesNotThrow(() -> SVG_3012_Jenkins.validateInput(60, 100));
    }





    @Test
    void timeCalculation_negativeSpeed_throws() {
        assertThrows(IllegalArgumentException.class,
                () -> SVG_3012_Jenkins.timeCal(-10, 100));
    }

    @Test
    void timeCalculation_negativeDistance_throws() {
        assertThrows(IllegalArgumentException.class,
                () -> SVG_3012_Jenkins.timeCal(60, -100));
    }

    // ---------- printResult ----------



    @Test
    void printResult_negativeInput_throws() {
        assertThrows(IllegalArgumentException.class,
                () -> SVG_3012_Jenkins.printReport(-1, 100));
    }
}