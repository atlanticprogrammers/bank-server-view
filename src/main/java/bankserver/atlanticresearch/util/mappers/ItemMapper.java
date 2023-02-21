package bankserver.atlanticresearch.util.mappers;

import bankserver.atlanticresearch.dto.CurrencyExchangeRatesDTO;
import bankserver.atlanticresearch.entity.CurrencyExchangeRates;
import org.mapstruct.Mapper;
import org.springframework.data.domain.Page;
import java.util.List;

@Mapper(componentModel = "spring")
public interface ItemMapper {
    List<CurrencyExchangeRatesDTO> pageToList(Page<CurrencyExchangeRates> items) ;
}
