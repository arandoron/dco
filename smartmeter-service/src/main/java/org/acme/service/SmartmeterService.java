package org.acme.service;

import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

import org.acme.domain.Smartmeter;

import jakarta.enterprise.context.ApplicationScoped;

/**
 * SmartmeterService
 */
@ApplicationScoped
public class SmartmeterService {
  private final Map<String, Smartmeter> fakeDatabase = new ConcurrentHashMap<>();

  public Smartmeter createSmartmeter(Smartmeter smartmeter) {
    String id = UUID.randomUUID().toString();
    Smartmeter created = new Smartmeter(
        id,
        smartmeter.propertyId(),
        smartmeter.geoLocation());
    fakeDatabase.put(id, created);
    return created;
  }

  public Smartmeter findSmartmeterById(String smartmeterId) {
    return fakeDatabase.get(smartmeterId);
  }
}
