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
    name = "Uniquely identifies the account",
    dataType = "java.lang.String",
    example = "MILES",
    required = true)

    private void setAccountCreationDate(LocalDate accountCreationDate) {
    }

    private void setMiles(long accountMiles) {
    }

    public void getAccount() {
    }
}
