package za.ac.nwu.ac.translator;

import za.ac.nwu.ac.domain.dto.AccountDto;

import java.util.List;

public interface AccountTranslator {
    List<AccountDto> getAllAccounts();

    AccountDto create(AccountDto account);
}
