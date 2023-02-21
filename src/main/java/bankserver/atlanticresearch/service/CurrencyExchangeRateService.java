package bankserver.atlanticresearch.service;

import bankserver.atlanticresearch.dto.paginated.PaginatedResponseCurrencyExchangeRatesDTO;

public interface CurrencyExchangeRateService {
    PaginatedResponseCurrencyExchangeRatesDTO getAllCurrencyExchangeRatesForParticularCurrency(String currencyName, int size, int page);
}
