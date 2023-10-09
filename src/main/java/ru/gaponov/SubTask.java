package ru.gaponov;

import java.util.Objects;

public class SubTask extends AbstractTask {

    private int epicLinkId;

    public int getEpicLinkId() {
        return epicLinkId;
    }

    public void setEpicLinkId(int epicLinkId) {
        this.epicLinkId = epicLinkId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        SubTask subTask = (SubTask) o;
        return epicLinkId == subTask.epicLinkId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), epicLinkId);
    }

    @Override
    public String toString() {
        return "SubTask{" +
                "epicLinkId=" + epicLinkId +
                '}';
    }
}
