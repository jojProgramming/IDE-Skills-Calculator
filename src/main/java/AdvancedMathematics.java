/// This class has no top-level documentation, try Ctrl+Clicking the class name to look at each function.
public final class AdvancedMathematics {
    //<editor-fold default-state="collapsed" desc="You don't need to understand the code within this collapsed section for the workshop.">

    private AdvancedMathematics()
    {
        // Prevents instantiation by not offering access to the constructor
    }

    //</editor-fold>

    /// Take the base `base` logarithm of `operand`, and place the result into `buffer`.
    ///
    /// @param buffer The buffer in which the result will be stored
    /// @param base The base of the log function
    /// @param operand The operand to the log function
    public static void log(Buffer buffer, double base, double operand) {
        // TODO: Implement this function
        // HINT: Use the change of base log formula.
        // <editor-fold desc="If you're looking for an extra challenge, try implementing it yourself, otherwise just expand this to see a working implementation." defaultState="collapsed">
        // Using the change of base formula, log_b(a) is the same as log(a) / log(b):
        // double result = Math.log(operand) / Math.log(base);
        // buffer.setValue(result);
        // </editor-fold>
    }

    /// Take the base `base` logarithm of `operand`, and place the result into `buffer`.
    ///
    /// @param buffer The buffer in which the result will be stored
    /// @param base The base of the log function
    /// @param operand The operand to the log function
    public static void exponent(Buffer buffer, double base, double operand) {
        // TODO: Implement this function
        // HINT: Use the change of base log formula.
        // <editor-fold desc="If you're looking for an extra challenge, try implementing it yourself, otherwise just expand this to see a working implementation." defaultState="collapsed">
        // Using the change of base formula, log_b(a) is the same as log(a) / log(b):
        // double result = Math.pow(base, operand);
        // buffer.setValue(result);
        // </editor-fold>
    }
}
