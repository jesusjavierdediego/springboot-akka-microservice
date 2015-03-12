package com.hppoc.sbakka.service

import org.springframework.data.repository.CrudRepository
import com.hppoc.sbakka.domain.Hotel
import java.lang.Long

trait HotelRepository extends CrudRepository[Hotel, Long]