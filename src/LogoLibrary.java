import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class LogoLibrary {
    private static volatile LogoLibrary logoLibrary;
    private static List<Logo> logoList = new ArrayList<>();

    private LogoLibrary() {
    }

    public static synchronized LogoLibrary getInstance() {
        if (logoLibrary == null) {
            logoLibrary = new LogoLibrary();
        }

        return logoLibrary;
    }

    public static void insertLogo(Logo logo) {
        logoList.add(logo);
    }

    public static Optional<Logo> getLogo(String key) {
        return logoList.stream().filter(logo -> logo.getKey().equals(key)).findFirst();
    }
}