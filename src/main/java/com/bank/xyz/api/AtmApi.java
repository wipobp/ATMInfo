package com.bank.xyz.api;

import com.bank.xyz.model.InlineResponse200;
import com.bank.xyz.model.ATMInfo1;

import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2018-11-08T06:20:50.752Z")

@Api(value = "atm", description = "the atm API")
public interface AtmApi {

    @ApiOperation(value = "To get ATM info", notes = "Get from DB", response = InlineResponse200.class, tags={ "ATM", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = InlineResponse200.class) })
    @RequestMapping(value = "/atm",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    default ResponseEntity<InlineResponse200> 1() {
        // do some magic!
        return new ResponseEntity<InlineResponse200>(HttpStatus.OK);
    }


    @ApiOperation(value = "Add a new ATM", notes = "Add to DB", response = Void.class, tags={ "ATM", })
    @ApiResponses(value = {  })
    @RequestMapping(value = "/atm",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    default ResponseEntity<Void> 2(

@ApiParam(value = ""  ) @RequestBody ATMInfo1 aTMInfo

) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

}
