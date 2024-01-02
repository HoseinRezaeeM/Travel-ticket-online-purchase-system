package travelticketonlinepurchasesystem.Service.impl;

import travelticketonlinepurchasesystem.Service.TripService;
import travelticketonlinepurchasesystem.base.service.impl.BaseEntityServiceImpl;
import travelticketonlinepurchasesystem.domin.Trip;
import travelticketonlinepurchasesystem.repository.TripRepository;

import java.time.LocalDate;
import java.util.List;

public class TripServiceImpl extends BaseEntityServiceImpl<Integer, Trip, TripRepository> implements TripService {
      public TripServiceImpl(TripRepository baseRepository) {
            super(baseRepository);
      }

      @Override
      public List<Trip> findTripBystartAndEndAndstartDate(String origin, String destination,String vehicleType, LocalDate startDate) {
            return baseRepository.findTripBystartAndEndAndstartDate(origin,destination,vehicleType,startDate);
      }
}
