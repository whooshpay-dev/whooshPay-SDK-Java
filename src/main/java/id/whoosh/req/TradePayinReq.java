package id.whoosh.req;


public class TradePayinReq extends TradeReq {

    /**
     * paymentMethod
     */
    private String paymentMethod;

    /**
     * payer info
     */
    private PayerReq payer;

    /**
     * receiver info
     */
    private ReceiverReq receiver;

    /**
     * expiryPeriod
     */
    private Integer expiryPeriod;

    /**
     * 计算支付金额 Included/Excluded. 默认 Included
     */
    private String feeMethod;

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public PayerReq getPayer() {
        return payer;
    }

    public void setPayer(PayerReq payer) {
        this.payer = payer;
    }

    public ReceiverReq getReceiver() {
        return receiver;
    }

    public void setReceiver(ReceiverReq receiver) {
        this.receiver = receiver;
    }

    public Integer getExpiryPeriod() {
        return expiryPeriod;
    }

    public void setExpiryPeriod(Integer expiryPeriod) {
        this.expiryPeriod = expiryPeriod;
    }

    public String getFeeMethod() {
        return feeMethod;
    }

    public void setFeeMethod(String feeMethod) {
        this.feeMethod = feeMethod;
    }
}
