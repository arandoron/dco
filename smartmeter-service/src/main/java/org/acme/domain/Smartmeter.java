package org.acme.domain;

/**
 * Smatermeter
 */
public record Smartmeter(
    String smartmeterId,
    Long propertyId,
    GeoLocation geoLocation) {
}
