import java.util.Optional;

public interface LogoStrategy {
    void createLogo(Transaction transaction);

    Optional<Logo> getLogo(Transaction transaction);
}