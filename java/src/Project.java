public class Project {
    private String name;
    private int budget;
    private int timeline;
    private int size;
    public Project(String name,int budget, int timeline,int size){//更该为project,setProjectType是个错误的东西
        this.name=name;
        this.budget=budget;
        this.timeline=timeline;
        this.size=size;
    }
    public String getName(){
        return name;

    }
    public int getBudget(){
        return budget;
    }
    public int getTimeLine(){
        return timeline;
    }
    public int size(){
        return size;
    }
    public boolean equals(Object obj){
        if(obj==null||getClass()!=obj.getClass()){
            return false;
        }
        Project other=(Project)obj;
        return name==other.name&&
               budget==other.budget&&
               timeline==other.timeline&&
               size==other.size;
    }

}
