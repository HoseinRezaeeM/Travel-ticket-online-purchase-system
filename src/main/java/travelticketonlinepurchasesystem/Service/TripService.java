package travelticketonlinepurchasesystem.Service;

import travelticketonlinepurchasesystem.base.service.BaseEntityService;
import travelticketonlinepurchasesystem.domin.Trip;

import java.time.LocalDate;
import java.util.List;

public interface TripService extends BaseEntityService<Integer, Trip> {
      List<Trip> findTripBystartAndEndAndstartDate(String origin, String destination,String vehicletype, LocalDate startDate);
}
