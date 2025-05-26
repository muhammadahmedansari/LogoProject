import java.util.Optional;

public class LogoService {
    Optional<Logo> fetchLogo(Transaction transaction) {
        LogoStrategy logoStrategy = LogoFactory.getLogoStrategy(transaction.getLogoTypeFromTransactionType());
        Optional<Logo> logo = logoStrategy.getLogo(transaction);
        if (logo.isPresent()) {
            return logo;
        } else {
            logoStrategy.createLogo(transaction);
        }
        return Optional.empty();
    }
}