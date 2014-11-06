package com.gft.sbakka.service

import org.springframework.data.repository.CrudRepository
import com.gft.sbakka.domain.Hotel
import java.lang.Long

trait HotelRepository extends CrudRepository[Hotel, Long]