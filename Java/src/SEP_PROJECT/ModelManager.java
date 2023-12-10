package SEP_PROJECT;

import java.util.ArrayList;
import java.util.List;

public class ModelManager
{
  private ProjectList projectList;
  private FileManager fileManager;

  public void loadProjects()
  {
    //implement load Projects from file or database
    //this.projectList = filemanager.load();
  }

  public void saveProjects()
  {
    //implement save Projects to file or database
    //filemanager.save(projectList);
  }

  public void createProject(Project project)
  {
    //Do stuff
    projectList.addProject(project);
  }

  public void updateProject(Project projectToUpdate)
  {
    Project project = projectList.getProjectByName(
        projectToUpdate.getProjectName());
    project = projectToUpdate;
  }

  public List<Project> trackCompletedProjectByType(String type)
  {
    List<Project> completedProject = projectList.trackCompletedProjects();
    List<Project> completedProjectByType = new ArrayList<>();
    for (Project project : completedProject)
    {
      if (project.getProjectType().equals(type))
      {
        completedProjectByType.add(project);
      }
    }
    return completedProjectByType;
  }

  public List<Project> trackCompletedProjectbyBudget(double budget)
  {
    List<Project> completedProject = projectList.trackCompletedProjects();
    List<Project> completedProjectByBudget = new ArrayList<>();
    for (Project project : completedProject)
    {
      if (project.getBudgetRangeMin() <= budget
          && project.getBudgetRangeMax() >= budget)
      {
        completedProjectByBudget.add(project);
      }
    }
    return completedProjectByBudget;
  }

  public List<Project> trackCompletedProjectByTimeLine(int timeline)
  {
    List<Project> completedProjects = projectList.trackCompletedProjects();
    List<Project> completedProjectByTimeline = new ArrayList<>();
    for (Project project : completedProjects)
    {
      if (project.getTimeLine() <= timeline
          && project.getTimeLine() >= timeline)
      {
        completedProjectByTimeline.add(project);
      }
    }
    return completedProjectByTimeline;
  }

}
