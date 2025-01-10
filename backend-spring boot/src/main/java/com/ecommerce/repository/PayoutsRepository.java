package com.ecommerce.repository;

import com.ecommerce.domain.PayoutsStatus;
import com.ecommerce.model.Payouts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface PayoutsRepository extends JpaRepository<Payouts,Long> {

    List<Payouts> findPayoutsBySellerId(Long sellerId);
    List<Payouts> findAllByStatus(PayoutsStatus status);
}
