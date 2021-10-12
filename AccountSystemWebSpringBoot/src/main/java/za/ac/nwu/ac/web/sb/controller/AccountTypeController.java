/*
package za.ac.nwu.ac.web.sb.controller;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import za.ac.nwu.ac.domain.dto.AccountDto;
import za.ac.nwu.ac.domain.service.GeneralResponse;
import za.ac.nwu.ac.logic.flow.CreateAccountFlow;
import za.ac.nwu.ac.logic.flow.FetchAccountFlow;

import java.util.List;

@RestController
@RequestMapping("account")
public class AccountTypeController {

    private final FetchAccountFlow fetchAccountTypeFlow;
    private final CreateAccountFlow createAccountFlow;

    @Autowired
    public AccountTypeController(FetchAccountFlow fetchAccountTypeFlow,
                                 @Qualifier("CreateAccountFlowName") CreateAccountFlow createAccountFlow){
        this.fetchAccountTypeFlow = fetchAccountTypeFlow;
        this.createAccountFlow = createAccountFlow;
    }

    @GetMapping("/all")
    @ApiOperation(value = "Gets all the configured Accounts.", notes = "Returns a list of accounts.")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Account types returned", response = GeneralResponse.class),
            @ApiResponse(code = 400, message =
                    "Bad Request", response = GeneralResponse.class),
            @ApiResponse(code = 404, message = "Not found", response = GeneralResponse.class),
            @ApiResponse(code = 500, message = "Internal Server Error", response = GeneralResponse.class)
    })

    public ResponseEntity<GeneralResponse<List<AccountDto>>> getAll()
    {
        List<AccountDto> accountTypes = fetchAccountTypeFlow.getAllAccountTypes();
        GeneralResponse<List<AccountDto>> response = new GeneralResponse<>(true, accountTypes);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @PostMapping("")
    @ApiOperation(value = "Creates a new Account.", notes = "Creates a new account in the DB.")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "The Account was created successfully", response = GeneralResponse.class),
            @ApiResponse(code = 400, message = "Bad Request", response = GeneralResponse.class),
            @ApiResponse(code = 500, message = "Internal Server Error", response = GeneralResponse.class)})
    public ResponseEntity<GeneralResponse<AccountDto>> create(
            @ApiParam(value = "Request body to create a new Account.",
                    required = true)
            @RequestBody AccountDto account) {
        AccountDto accountResponse = createAccountFlow.create(account);
        GeneralResponse<AccountDto> response = new GeneralResponse<>(true, accountResponse);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

}

*/
