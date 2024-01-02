package travelticketonlinepurchasesystem.repository.impl;

import travelticketonlinepurchasesystem.base.repository.impl.BaseEntityRepositoryImpl;
import travelticketonlinepurchasesystem.domin.Customer;
import travelticketonlinepurchasesystem.domin.Trip;

import travelticketonlinepurchasesystem.repository.TripRepository;

import javax.persistence.EntityManager;
import java.time.LocalDate;
import java.util.List;
@SuppressWarnings("unchecked")
public class TripRepositoryImpl extends BaseEntityRepositoryImpl<Integer, Trip>  implements TripRepository{

      public TripRepositoryImpl(EntityManager entityManager) {
            super(entityManager);
      }

      @Override
      public Class<Trip> getEntityClass() {
            return Trip.class;
      }

      @Override
      public List<Trip> findTripBystartAndEndAndstartDate(String origin, String destination,String vehicleType, LocalDate startDate) {
            return entityManager
                   .createQuery("FROM Trip" +
                                " tr WHERE tr.origin=:origin AND " +
                                "tr.destination=:destination AND" +
                                " tr.startDate=:startDate AND " +
                                " tr.vehicleType=:vehicleType " +
                                " ORDER BY tr.startTime")
                   .setParameter("origin",origin)
                   .setParameter("destination",destination)
                   .setParameter("startDate",startDate)
                   .setParameter("vehicleType",vehicleType)
                   .getResultList();
      }


}
