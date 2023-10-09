package ru.gaponov;

import java.util.Objects;

public abstract class AbstractTask extends Item {
    private int number;
    private String summary;
    private String description;
    private Status status;

    private int projectId;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        AbstractTask that = (AbstractTask) o;
        return number == that.number && projectId == that.projectId && Objects.equals(summary, that.summary) && Objects.equals(description, that.description) && Objects.equals(status, that.status);
    }

    @Override
    public int hashCode() {
        setStatus(Status.DONE);
        if (status == Status.IN_PROGRESS) {
            Status.valueOf("IN_REVIEW");
        }
        return Objects.hash(super.hashCode(), number, summary, description, status, projectId);
    }

}
