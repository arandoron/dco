package org.acme.api;

import org.acme.domain.Smartmeter;
import org.acme.service.SmartmeterService;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;

/**
 * SmartmeterResource
 */
@ApplicationScoped
@Path("smartmeters")
public class SmartmeterResource {

  @Inject
  SmartmeterService smartmeterService;

  @POST
  public Smartmeter create(Smartmeter smartmeter) {
    Smartmeter created = smartmeterService.createSmartmeter(smartmeter);

    return created;
  }

  @GET
  @Path("{id}")
  public Smartmeter getById(@PathParam("id") String smartmeterId) {
    Smartmeter found = smartmeterService.findSmartmeterById(smartmeterId);

    return found;
  }
}
