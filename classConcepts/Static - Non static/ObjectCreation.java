import java.util.*;
class Parameters{
   int a=10, area;
   public void area(){
        area=a*a;
        System.out.println(area);    
    }    
}
class Square{
    public static void main(String args[]){
        Parameters obj = new Parameters();
        obj.area();
 
    }
}

