package ru.gaponov;

import java.util.Objects;

public class Project extends Item {

    private String projectName;
    private String projectKey;

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectKey() {
        return projectKey;
    }

    public void setProjectKey(String projectKey) {
        this.projectKey = projectKey;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Project project = (Project) o;
        return Objects.equals(projectName, project.projectName) && Objects.equals(projectKey, project.projectKey);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), projectName, projectKey);
    }

    @Override
    public String toString() {
        return "Project{" +
                "projectName='" + projectName + '\'' +
                ", projectKey='" + projectKey + '\'' +
                '}';
    }
}
