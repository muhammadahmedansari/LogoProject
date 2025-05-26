import java.util.Optional;

public class WalletLogo implements LogoStrategy {
    @Override
    public void createLogo(Transaction transaction) {
        System.out.println("Creating Wallet Logo");
    }

    @Override
    public Optional<Logo> getLogo(Transaction transaction) {
        System.out.println("Getting Wallet Logo");
        return Optional.empty();
    }
}