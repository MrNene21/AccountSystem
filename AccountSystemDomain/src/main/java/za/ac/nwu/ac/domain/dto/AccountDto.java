package za.ac.nwu.ac.domain.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import za.ac.nwu.ac.domain.persistence.ACCOUNT;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

@ApiModel(value = "Account", description = "A DTD that represents the Account")

public class AccountDto implements Serializable {

    private static final long serialVersionUID = 5848474355837282529L;

    private int miles;
    private LocalDate accountCreationDate;

    private AccountDto(){
    }

    private AccountDto(int miles, LocalDate accountCreationDate){
        this.miles = miles;
        this.accountCreationDate = accountCreationDate;
    }

    public AccountDto(ACCOUNT account) {
        this.setMiles(account.getAccountMiles());
        this.setAccountCreationDate(account.getAccountCreationDate());
    }

    @ApiModelProperty(position = 1,
    value = "ACCOUNT Miles",
    name = "Miles",
    notes = "Uniquely identifies the account",
    dataType = "java.lang.int",
    example = "MILES",
    required = true
    )

    public int getMiles() {
        return miles;
    }
    public void setMiles(int miles){ this.miles = miles;}

    @ApiModelProperty(position = 2,
            value = "Account Creation Date",
            name = "CreationDate",
            notes = "This is the date on which the Account was created",
            dataType = "java.long.String",
            example = "2020-01-01",
            allowEmptyValue = true
    )

    public LocalDate getAccountCreationDate(){return accountCreationDate;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AccountDto that = (AccountDto) o;
        return Objects.equals(miles, that.miles) &&Objects.equals(accountCreationDate, that.accountCreationDate);
    }

    @JsonIgnore
    public ACCOUNT getAccount(){
        return new ACCOUNT(getMiles(), getAccountCreationDate());
    }

    @Override
    public int hashCode() {
        return Objects.hash(miles, accountCreationDate);
    }

    @Override
    public String toString() {
        return "AccountDto{" +
                "miles=" + miles +
                ", accountCreationDate=" + accountCreationDate +
                '}';
    }

    private void setAccountCreationDate(LocalDate accountCreationDate) {
    }

    private void setMiles(long accountMiles) {
    }


}
