package Account;

public class Credit
{
    private int limitMax,
                limitAvailable,
                currentInvoice;


    public Credit()
    {
        limitMax = 200;
    }
    public String getBalance()
    {
        return String.format("$%d Current invoice, $%d Limit credit Available", currentInvoice, limitAvailable);
    }

    public int getLimitMax() {
        return limitMax;
    }

    public void setLimitMax(int limitMax) {
        this.limitMax = limitMax;
    }
}
