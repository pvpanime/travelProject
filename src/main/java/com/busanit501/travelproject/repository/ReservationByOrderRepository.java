package com.busanit501.travelproject.repository;

import com.busanit501.travelproject.domain.Reservation;
import com.busanit501.travelproject.domain.common.ReservationOrder;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.EntityGraph;

public interface ReservationByOrderRepository {
    @EntityGraph(attributePaths = {"product"})
    Page<Reservation> selectReservationUser(Long memberNo, ReservationOrder reservationOrder, Pageable pageable);

    //    @Query("select r from Reservation r where r.product.productNo = :productNo")
    Page<Reservation> selectReservationAdmin(Long productNo,Pageable pageable);
}
