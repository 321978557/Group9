public class FileManager
{
  private String content;
  private String images;
  //diagrame没有构造器
  public void setContent(String content){
    this.content = content;
  }
  public void setImages(String images){
    this.images = images;
  }
  public String getContent(){
    return content;
  }
  public String getImages(){
    return images;
  }
  @Override
  public String toString(){
    StringBuilder sb = new StringBuilder();
    sb.append(content);
    sb.append(images);
    return sb.toString();
  }
}
