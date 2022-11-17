package com.oracle.s20221103.pej.service;

import org.springframework.stereotype.Service;

import com.oracle.s20221103.pej.dao.PejDao;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PejServiceImpl implements PejService {
	private final PejDao pd;
}
