package SEP_PROJECT;


import java.util.List;

public class FileManager
{
  private String content;
  private String images;

  public FileManager(String content, String images){
    this.content=content;
    this.images=images;
  }

  public String getContent()
  {
    return content;
  }

  public void setContent(String content)
  {
    this.content = content;
  }

  public String getImages()
  {
    return images;
  }

  public void setImages(String images)
  {
    this.images = images;
  }
  public String toString(){
    return "Content: "+content + "Images: "+images;
  }

  public void save(List<Project> projectList)
  {
    Projects projects = new Projects();
    projects.setProjectList(projectList);

    //    JAXBContext context = null;
    //    try
    //    {
    //      context = JAXBContext.newInstance(Projects.class);
    //      Marshaller marshaller = context.createMarshaller();
    //      marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
    //
    //      marshaller.marshal(projects, new File("projects.xml"));
    //    }
    //    catch (JAXBException e)
    //    {
    //      throw new RuntimeException(e);
    //    }
    //  }
    //
    //  public List<Project> load() throws Exception {
    //    JAXBContext context = JAXBContext.newInstance(Projects.class);
    //    Unmarshaller unmarshaller = context.createUnmarshaller();
    //
    //    Projects projects = (Projects) unmarshaller.unmarshal(new File("projects.xml"));
    //    return projects.getProjectList();
    //  }
  }
}
