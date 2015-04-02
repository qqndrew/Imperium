package net.kingdomsofarden.townships.util;

import net.kingdomsofarden.townships.api.util.BoundingBox;
import org.bukkit.Location;

import java.util.UUID;

public class AxisAlignedBoundingBox implements BoundingBox {
    protected int maxX;
    protected int maxY;
    protected int maxZ;
    protected int minX;
    protected int minY;
    protected int minZ;
    protected UUID world;

    public AxisAlignedBoundingBox(Location loc1, Location loc2) {

    }

    @Override
    public boolean isInBounds(Location loc) {
        return loc.getWorld().getUID().equals(world) && isInBounds(loc.getX(), loc.getY(), loc.getZ());
    }

    @Override
    public boolean isInBounds(double x, double y, double z) {
        return (minX <= x) && (x <= maxX) && (minY <= y) && (y <= maxY) && (minZ <= z) && (z <= maxZ);
    }

    @Override
    public int getMinX() {
        return minX;
    }

    @Override
    public int getMaxX() {
        return maxX;
    }

    @Override
    public int getMinY() {
        return minY;
    }

    @Override
    public int getMaxY() {
        return maxY;
    }

    @Override
    public int getMinZ() {
        return minZ;
    }

    @Override
    public int getMaxZ() {
        return maxZ;
    }
}
