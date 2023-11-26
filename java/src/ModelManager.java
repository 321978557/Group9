import java.util.ArrayList;
public class ModelManager {
    private String details;
    private ArrayList<Project>projects;
    public ModelManager(String details,Project project){
         projects=new ArrayList<Project>();
         this.details=details;

    }
    public void addProjectList(Project project){
       projects.add(project);
    }
    public String getDetails(){
        return details;
    }
   public int getProjectListData(){
        return projects.size();
   }
   public Project getProjectList(int index){
       return projects.get(index);
   }
    public ArrayList<Project> getAllProject(String projectDetails) {
        ArrayList<Project> answer = new ArrayList<>();

        for (int i = 0; i < projects.size(); i++) {
            // Assuming Project has a method to get details, replace "details" with the actual method
            if (projects.get(i).equals(projectDetails)) {
                answer.add(projects.get(i));
            }
        }

        return answer;
    }

}
