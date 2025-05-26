import java.util.Optional;

public class CategoryLogo implements LogoStrategy {
    @Override
    public void createLogo(Transaction transaction) {
        System.out.println("Creating category Logo");
    }

    @Override
    public Optional<Logo> getLogo(Transaction transaction) {
        System.out.println("Getting category Logo");
        return Optional.empty();
    }
}