package za.ac.nwu.ac.logic.flow;

import za.ac.nwu.ac.domain.dto.AccountDto;

public interface CreateAccountTypeFlow {
    AccountDto create(AccountDto account);
}
