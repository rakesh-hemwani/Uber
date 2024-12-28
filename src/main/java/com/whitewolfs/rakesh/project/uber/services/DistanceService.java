package com.whitewolfs.rakesh.project.uber.services;

import org.locationtech.jts.geom.Point;

public interface DistanceService {

    double calculateDistance(Point src, Point dst);
}
