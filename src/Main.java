import java.math.BigDecimal;
import java.time.LocalDate;

public class Main {
    public static BigDecimal totalPrice(BigDecimal pricePerPiece, int quantity) {
        return pricePerPiece.multiply(BigDecimal.valueOf(quantity));
    }

    public static void main(String[] args) {
        String item = "Trekové boty Sedmimílovky";
        int quantity = 3;
        double weight = 0.45;
        BigDecimal pricePerPiece = BigDecimal.valueOf(1800);
        LocalDate dateOfIssue = LocalDate.of(2022, 4, 7);
        boolean isDiscounted = true;

        final double DISCOUNT = 0.05;
        final double PRICE_TRACK = 1000;

        quantity = 2;
        pricePerPiece = BigDecimal.valueOf(1990);

        double weightOfShipment = weight * quantity;
        System.out.println("Hmotnost zásilky: " + weightOfShipment);
        BigDecimal totalPrice = totalPrice(pricePerPiece, quantity);
        totalPrice = totalPrice.add(BigDecimal.valueOf(45));
        System.out.println("Celková cena: " + totalPrice);

        if (isDiscounted) {
            totalPrice = totalPrice.multiply(BigDecimal.valueOf(DISCOUNT));
        }

        for (int i = 0; i < quantity; i++) {
            System.out.println(item);
        }
        // POKUS
    }
}
