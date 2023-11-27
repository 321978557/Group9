package SEP_PROJECT;

import java.util.ArrayList;
import java.util.List;

public class ProjectList
{
  public ProjectList(List<Project> projects)
  {
    this.projects = projects;
  }

  private List<Project> projects;

  public List<Project> listProjects()
  {
    return projects;
  }

  public void addProject(Project project)
  {
    projects.add(project);
  }

  public void removeProject(Project project)
  {
    projects.remove(project);
  }

  public Project getProjectByName(String name)
  {
    for (Project project : projects)
    {
      if (project.getProjectName().equals(name))
      {
        return project;
      }
    }
    return null;
  }

  public List<Project> getProjectsByType(String type)
  {
    List<Project> projectsToReturn = new ArrayList<>();
    for (Project project : projects) {
      if (project.getProjectType().equals(type))
      {
        projectsToReturn.add(project);
      }
    }
    return projectsToReturn;
  }

  public List<Project> trackCompletedProjects() {
    List<Project> list = new ArrayList<>();
    for (Project project : projects)
    {
      if (project.isCompleted())
      {
        list.add(project);
      }
    }
    return list;

//    return projects.stream().filter(Project::isCompleted).toList();
  }

}
