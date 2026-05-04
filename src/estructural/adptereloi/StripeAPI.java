package estructural.adptereloi;

public class StripeAPI {
    public String charge(int amountInCents, String currency) {
        if (amountInCents > 0) {
            return "OK";
        } else {
            return "ERROR";
        }
    }
}
