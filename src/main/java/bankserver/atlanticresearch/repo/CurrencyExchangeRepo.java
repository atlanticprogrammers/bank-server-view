package bankserver.atlanticresearch.repo;

import bankserver.atlanticresearch.entity.CurrencyExchangeRates;
import bankserver.atlanticresearch.entity.CurrencyId;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableJpaRepositories
public interface CurrencyExchangeRepo extends JpaRepository<CurrencyExchangeRates, CurrencyId> {
    Page<CurrencyExchangeRates> findAllByCurrencyNameEquals(String currencyName, Pageable of);
    long countAllByCurrencyNameEquals(String currencyName);
}
