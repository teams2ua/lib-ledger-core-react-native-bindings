// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from erc20.djinni

package co.ledger.core;

import java.util.ArrayList;
import java.util.Date;

/** ERC20-like balance history. */
public final class ERC20LikeBalanceHistory {


    /*package*/ final TimePeriod period;

    /*package*/ final Date startDate;

    /*package*/ final Date endDate;

    /*package*/ final ArrayList<BigInt> balances;

    public ERC20LikeBalanceHistory(
            TimePeriod period,
            Date startDate,
            Date endDate,
            ArrayList<BigInt> balances) {
        this.period = period;
        this.startDate = startDate;
        this.endDate = endDate;
        this.balances = balances;
    }

    /** Period used when representing the history. */
    public TimePeriod getPeriod() {
        return period;
    }

    /** Start date of the history. */
    public Date getStartDate() {
        return startDate;
    }

    /** End date of the history. */
    public Date getEndDate() {
        return endDate;
    }

    /** Chronologically-sorted balance history accross time. */
    public ArrayList<BigInt> getBalances() {
        return balances;
    }

    @Override
    public String toString() {
        return "ERC20LikeBalanceHistory{" +
                "period=" + period +
                "," + "startDate=" + startDate +
                "," + "endDate=" + endDate +
                "," + "balances=" + balances +
        "}";
    }

}
