package org.acme.domain;

/**
 * Smartmeter
 */
public record Smartmeter(
    String smartmeterId,
    Long propertyId,
    GeoLocation geoLocation) {
}
