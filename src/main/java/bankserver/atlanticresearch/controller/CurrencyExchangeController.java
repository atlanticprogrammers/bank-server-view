package bankserver.atlanticresearch.controller;

import bankserver.atlanticresearch.dto.paginated.PaginatedResponseCurrencyExchangeRatesDTO;
import bankserver.atlanticresearch.service.CurrencyExchangeRateService;
import bankserver.atlanticresearch.util.StandardResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/currency-exchange")
@CrossOrigin
public class CurrencyExchangeController {

    @Autowired
    CurrencyExchangeRateService currencyExchangeRateService;

    @GetMapping(
            params = {"currencyName", "page", "size"},
            path = {"/get-currency-details"}
    )
    public ResponseEntity<StandardResponse> getAllCurrencyDetails(
            @RequestParam(value = "currencyName") String currencyName,
            @RequestParam(value = "page") int page,
            @RequestParam(value = "size") int size
    ) {
        PaginatedResponseCurrencyExchangeRatesDTO allCurrencyExchangeRatesForParticularCurrency = this.currencyExchangeRateService.getAllCurrencyExchangeRatesForParticularCurrency(currencyName, size, page);
        return new ResponseEntity<StandardResponse>(
                new StandardResponse(200,"Successfully Loaded", allCurrencyExchangeRatesForParticularCurrency),
                HttpStatus.OK
        );
    }
}
