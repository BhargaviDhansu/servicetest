package com.cg.ofr.dto;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;


import org.junit.jupiter.api.BeforeAll;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.cg.ofr.dto.FlatBookingDto;

@SpringBootTest
class FlatBookingDtoTest {
	
	static FlatBookingDto flatbookingDto;

	@BeforeAll
	static void setUp()  {
		flatbookingDto =new FlatBookingDto();
	    flatbookingDto.setBookingNo(1);
		flatbookingDto.setBookingFromDate(LocalDate.of(2020, 8, 9));
		flatbookingDto.setBookingToDate(LocalDate.of(2020, 7, 6));
		
		
	}

	

	@Test
	 void testGetters() {
		assertEquals(1,flatbookingDto.getBookingNo());
		assertEquals(LocalDate.of(2020, 8, 9),flatbookingDto.getBookingFromDate());
		assertEquals(LocalDate.of(2020, 7, 6),flatbookingDto.getBookingToDate());
		
	}

}
