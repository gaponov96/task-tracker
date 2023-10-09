package ru.gaponov;

import java.util.Objects;

public abstract class Item {

    private long id;

    private boolean isActive;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return id == item.id && isActive == item.isActive;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, isActive);
    }
}
