import java.util.HashMap;
import java.util.Map;

public class LogoFactory {
    final static Map<LogoType, LogoStrategy> map = new HashMap<>();

    static {
        map.put(LogoType.OneLink, new OneLinkLogo());
        map.put(LogoType.Merchant, new MerchantLogo());
        map.put(LogoType.Wallet, new WalletLogo());
    }

    public static LogoStrategy getLogoStrategy(LogoType logoType) {
        return map.get(logoType);
    }
}