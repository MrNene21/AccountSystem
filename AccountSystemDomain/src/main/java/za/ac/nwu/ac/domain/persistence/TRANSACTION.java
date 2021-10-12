package za.ac.nwu.ac.domain.persistence;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

//@Entity
@Table(name = "GOALS", schema = "LUYANDA")

public class TRANSACTION implements Serializable {

    private static final long serialVersionUID = 9033504970463516642L;

    private long transactionID;
    private double transactionAmount;
    private LocalDate transactionDate;
    private ACCOUNT account;
    private MEMBER member;

    public TRANSACTION(long transactionID, double transactionAmount, LocalDate transactionDate, ACCOUNT account, MEMBER member) {
        this.transactionID = transactionID;
        this.transactionAmount = transactionAmount;
        this.transactionDate = transactionDate;
        this.account = account;
        this.member = member;
    }

    public TRANSACTION() {
    }

    @Id
    @SequenceGenerator(name = "VIT_RSA_GENERIC_SEQ", sequenceName = "VITRSA_SANDBOX.VIT_RSA_GENERIC_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "VIT_RSA_GENERIC_SEQ")
    @Column(name = "TRANSACTION_ID")
    public long getTransactionID() {
        return transactionID;
    }

    public void setTransactionID(long transactionID) {
        this.transactionID = transactionID;
    }

    @Column(name = "TRANSACTION_AMOUNT")
    public double getTransactionAmount() {
        return transactionAmount;
    }

    public void setTransactionAmount(double transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    @Column(name = "TRANSACTION_DATE")
    public LocalDate getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(LocalDate transactionDate) {
        this.transactionDate = transactionDate;
    }


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ACCOUNT_ID")
    public ACCOUNT getAccount() {
        return account;
    }

    public void setAccount(ACCOUNT account) {
        this.account = account;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MEMBER_ID")
    public MEMBER getMember() {
        return member;
    }

    public void setMember(MEMBER member) {
        this.member = member;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TRANSACTION that = (TRANSACTION) o;
        return transactionID == that.transactionID && Double.compare(that.transactionAmount, transactionAmount) == 0 && Objects.equals(transactionDate, that.transactionDate) && Objects.equals(account, that.account) && Objects.equals(member, that.member);
    }

    @Override
    public int hashCode() {
        return Objects.hash(transactionID, transactionAmount, transactionDate, account, member);
    }

    @Override
    public String toString() {
        return "TRANSACTION{" +
                "transactionID=" + transactionID +
                ", transactionAmount=" + transactionAmount +
                ", transactionDate=" + transactionDate +
                ", account=" + account +
                ", member=" + member +
                '}';
    }
}
