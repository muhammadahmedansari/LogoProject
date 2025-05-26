import java.util.Arrays;
import java.util.List;

public class Transaction {
    private String transactionType;
    private String mcc;
    private String merchantId;
    private String bankCode;
    private String scheme;

    LogoType getLogoTypeFromTransactionType() {
        final List<String> onelink = Arrays.asList("oneline", "oneline_biller");
        final List<String> wallet = Arrays.asList("wallet2", "wallet1");
        final List<String> merchant = Arrays.asList("merchant2", "merchant1");

        if (onelink.contains(transactionType)) {
            return LogoType.OneLink;
        } else if (wallet.contains(transactionType)) {
            return LogoType.Wallet;
        } else if (merchant.contains(transactionType)) {
            return LogoType.Merchant;
        } else {
            return null;
        }
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public String getMcc() {
        return mcc;
    }

    public void setMcc(String mcc) {
        this.mcc = mcc;
    }

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    public String getScheme() {
        return scheme;
    }

    public void setScheme(String scheme) {
        this.scheme = scheme;
    }

}
