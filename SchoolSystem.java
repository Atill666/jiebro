import org.omg.PortableInterceptor.INACTIVE;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;


//第一次添加注释
//第二次添加注释
interface ISignup{
    public void print();
    public boolean addStudent(int strType);
    public static IParams parse() throws Exception{

    };
}


interface IParams{
    public int getBig();
    public int getMedium();
    public int getSmall();
    public ArrayList<Integer> getPlanSignUp();
}

public class SchoolSystem implements ISignup{
    Integer big;
    Integer medium;
    Integer small;
    public SchoolSystem(Integer big,Integer medium,Integer small){
        this.big=big;
        this.medium=medium;
        this.small=small;
    };

    boolean addStudent(Integer stuType){
return false;
    };

//    public String[] parse(){
//        Scanner scanner=new Scanner(System.in);
//        String[] strings=new String[20];
//        String a=scanner.next();
//     do{
//         a=scanner.next();
//         if()
//     }while();
//    };



    public void print(){

    }

    @Override
    public boolean addStudent(int strType) {
        if(strType==1&&big>0){
            big--;
        }else if (strType==2&&medium>0){
            medium--;
        }else if (strType==3&&small>0){
            small--;
        }
        return false;
    }

    ;
    public static void main(String[] args) throws Exception {
        IParams params=ISignup.parse();
        SchoolSystem sc=new SchoolSystem(params.getBig(),params.getMedium(),params.getSmall());
    ArrayList<Integer> plan=params.getPlanSignUp();
        for (int i = 0; i < plan.size(); i++) {
            sc.addStudent(plan.get(i));
        }
        sc.print();
    }
}
