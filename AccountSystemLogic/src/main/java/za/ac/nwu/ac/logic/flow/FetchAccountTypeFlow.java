package za.ac.nwu.ac.logic.flow;

import za.ac.nwu.ac.domain.dto.AccountDto;

import java.util.List;

public interface FetchAccountTypeFlow {
    List<AccountDto> getAllAccountTypes();
}
