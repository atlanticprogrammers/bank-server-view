package bankserver.atlanticresearch.service.impl;

import bankserver.atlanticresearch.dto.paginated.PaginatedResponseCurrencyExchangeRatesDTO;
import bankserver.atlanticresearch.entity.CurrencyExchangeRates;
import bankserver.atlanticresearch.repo.CurrencyExchangeRepo;
import bankserver.atlanticresearch.service.CurrencyExchangeRateService;
import bankserver.atlanticresearch.util.mappers.ItemMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
public class CurrencyExchangeRateServiceIMPL implements CurrencyExchangeRateService {
    @Autowired
    private CurrencyExchangeRepo currencyExchangeRepo;

    @Autowired
    private ItemMapper itemMapper;

    @Override
    public PaginatedResponseCurrencyExchangeRatesDTO getAllCurrencyExchangeRatesForParticularCurrency(String currencyName, int size, int page) {
        Page<CurrencyExchangeRates> allByCurrencyNameEquals = this.currencyExchangeRepo.findAllByCurrencyNameEquals(currencyName, PageRequest.of(page, size));
        return new PaginatedResponseCurrencyExchangeRatesDTO(itemMapper.pageToList(allByCurrencyNameEquals),this.currencyExchangeRepo.countAllByCurrencyNameEquals(currencyName));
    }
}
