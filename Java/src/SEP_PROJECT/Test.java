package SEP_PROJECT;

import java.util.ArrayList;
import java.util.List;

public class Test
{
  public static void main(String[] args)
  {
    Residential res = new Residential(12);
    res.setProjectName("ChrisTEST");
    System.out.println("Project Type: " + res.getProjectType());
    List<Project> projectList = new ArrayList<>();

    projectList.add(res);

    ProjectList projectList1 = new ProjectList(projectList);
    Project emilProject = projectList1.getProjectByName("CHRISTEST");

    System.out.println(projectList);
    System.out.println(emilProject);

//    FileManager fileManager = new FileManager("", "");
//    fileManager.save(projectList);

  }
}

