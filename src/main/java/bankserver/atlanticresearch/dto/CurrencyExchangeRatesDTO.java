package bankserver.atlanticresearch.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class CurrencyExchangeRatesDTO {
    private String currencyName;
    private String bankShordKey;
    private double buyingRate;
    private double sellingRate;
    private String bankName;
    private Date lastUpdatedDate;
}
