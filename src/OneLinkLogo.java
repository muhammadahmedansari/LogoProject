import java.util.Optional;

public class OneLinkLogo implements LogoStrategy {
    @Override
    public void createLogo(Transaction transaction) {
        System.out.println("Creating Onelink Logo");
    }

    @Override
    public Optional<Logo> getLogo(Transaction transaction) {
        System.out.println("Getting Onelink Logo");
        return Optional.empty();
    }
}