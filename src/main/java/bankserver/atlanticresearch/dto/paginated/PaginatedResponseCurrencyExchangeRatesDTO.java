package bankserver.atlanticresearch.dto.paginated;

import bankserver.atlanticresearch.dto.CurrencyExchangeRatesDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class PaginatedResponseCurrencyExchangeRatesDTO {
    private List<CurrencyExchangeRatesDTO> CurrencyExchangeRatesDTOList;
    private long dataCount;
}
