package SEP_PROJECT;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement
public class Projects {
  private List<Project> projectList;

  public Projects() { }

  @XmlElement(name = "project")
  public List<Project> getProjectList() {
    return projectList;
  }

  public void setProjectList(List<Project> projectList) {
    this.projectList = projectList;
  }
}
