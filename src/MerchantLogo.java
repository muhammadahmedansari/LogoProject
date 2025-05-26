import java.util.Optional;

public class MerchantLogo implements LogoStrategy {

    LogoLibrary logoLibrary = LogoLibrary.getInstance();

    @Override
    public void createLogo(Transaction transaction) {
        System.out.println("Creating Merchant Logo");

        String merchantId = transaction.getMerchantId();
        String bankCode = transaction.getBankCode();
        String scheme = transaction.getScheme();

        String logoKey = merchantId + "_" + scheme + "_" + bankCode;
        Optional<Logo> logo = logoLibrary.getLogo(logoKey);
        if (logo.isEmpty()) {

            Logo logo1 = new Logo();
            logo1.setKey(logoKey);
            logo1.setName(transaction.getMerchantId());
            logo1.setTransactionType(transaction.getTransactionType());

            logoLibrary.insertLogo(logo1);
        }
    }

    @Override
    public Optional<Logo> getLogo(Transaction transaction) {
        System.out.println("Getting Merchant Logo");

        String merchantId = transaction.getMerchantId();
        String bankCode = transaction.getBankCode();
        String scheme = transaction.getScheme();

        String logoKey = merchantId + "_" + scheme + "_" + bankCode;

        return logoLibrary.getLogo(logoKey);
    }
}