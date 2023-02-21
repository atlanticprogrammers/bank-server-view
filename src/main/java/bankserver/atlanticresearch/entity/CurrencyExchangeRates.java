package bankserver.atlanticresearch.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.util.Date;

@Table(name = "currency_exchange_rates")
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@IdClass(CurrencyId.class)
public class CurrencyExchangeRates {
    @Id
    private String currencyName;

    @Id
    private String bankShordKey;

    @Column(name = "buying_rate", length = 50 , nullable = false)
    private double buyingRate;

    @Column(name = "selling_rate", length = 50 , nullable = false)
    private double sellingRate;

    @Column(name = "bank_name", length = 150 , nullable = false)
    private String bankName;

    @Column(name = "login_user", length = 150 , nullable = true)
    private String logInUser;

    @Column(name = "last_updated_date", columnDefinition = "DATETIME")
    private Date lastUpdatedDate;
}
