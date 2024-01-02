package travelticketonlinepurchasesystem.repository;

import travelticketonlinepurchasesystem.base.repository.BaseEntityRepository;
import travelticketonlinepurchasesystem.domin.Customer;
import travelticketonlinepurchasesystem.domin.Trip;

import java.time.LocalDate;
import java.util.List;

public interface TripRepository extends BaseEntityRepository<Integer, Trip> {

      List<Trip> findTripBystartAndEndAndstartDate(String origin, String destination,String vehicleType, LocalDate startDate);

}
