/**
 * NOTE: This class is auto generated by the swagger code generator program (2.4.16-SNAPSHOT).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package com.tutiempolibro.retrievecatalog.rest;

import com.tutiempolibro.retrievecatalog.entity.BookType;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-10-28T13:04:35.736-05:00")

@Api(value = "/v1/catalog", consumes = "application/json")
@RestController
@RequestMapping("/v1/catalog")
public class RetrieveBookCatalogApi {

	@ApiOperation(value = "return list of catalog books by Category", nickname = "retrieveBookCatalog", notes = "", response = BookType.class, responseContainer = "List", tags = {
			"retrieveBookCatalog", })
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "List of Books", response = BookType.class, responseContainer = "List") })
	@RequestMapping(value = "/retrieveBookCatalog", produces = { "application/json" }, method = RequestMethod.GET)
	public List<BookType> retrieveBookCatalog(
			@ApiParam(value = "Identifier for the system originating the request") @RequestHeader(value = "Application", required = false) String application,
			@ApiParam(value = "Including the proof of access (using OAuth2.0 security model) to guarantee that the consumer has privileges to access the entity database") @RequestHeader(value = "Authorization", required = false) String authorization,
			@ApiParam(value = "value ID category") @Valid @RequestParam(value = "categoryId", required = false) Integer categoryId) {
		
		
		
		return null;
	}
}