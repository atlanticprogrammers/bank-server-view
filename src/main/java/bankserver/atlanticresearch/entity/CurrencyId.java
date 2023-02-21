package bankserver.atlanticresearch.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import java.io.Serializable;
import lombok.EqualsAndHashCode;

@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class CurrencyId implements Serializable {
    private String currencyName;
    private String bankShordKey;
}
