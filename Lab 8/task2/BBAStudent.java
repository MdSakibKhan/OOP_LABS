class  BBAStudent extends Student{
  String name ="Default BBa Student";
  BBAStudent(){
    setName(name);
    setDepartment("BBA");
  }
  
  BBAStudent(String a){
       setName(a);
       name=getName();
    setDepartment("BBA");
  
  }
}
  
  