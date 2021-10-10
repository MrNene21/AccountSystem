package za.ac.nwu.ac.translator.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import za.ac.nwu.ac.domain.dto.AccountDto;
import za.ac.nwu.ac.domain.persistence.ACCOUNT;
import za.ac.nwu.ac.repo.persistence.AccountRepository;
import za.ac.nwu.ac.translator.AccountTranslator;

import java.util.ArrayList;
import java.util.List;

@Component
public class AccountTranslatorImpl implements AccountTranslator {

    private final AccountRepository accountRepository;

    @Autowired
    public AccountTranslatorImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }
    @Override
    public List<AccountDto> getAllAccounts() {
        List<AccountDto> accountDtos = new ArrayList<>();
        try{
            for(ACCOUNT account : accountRepository.findAll()){
                accountDtos.add(new AccountDto(account));
            }
        }
        catch (Exception e) {
            throw new RuntimeException("Unable to read from the database", e);
        }
        return accountDtos;
    }

    @Override
    public AccountDto create(AccountDto accountDto) {
        try{
            ACCOUNT account = accountRepository.save(accountDto.getAccount());
            return new AccountDto(account);
        }
        catch (Exception e) {
            throw new RuntimeException("Unable to save to the Database", e);
        }
    }
}
