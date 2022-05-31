package singleton;
//se apeleaza constructorul o singura data
public class Repartitor {

    private static Repartitor repartitor= null; //= new Repartitor()-> eager initialization

    private Repartitor(){
    }

    public static synchronized Repartitor getInstance(){  //thread safe -> sa nu se poata apela ina acelasi timp de doua ori constructorul
        if(repartitor==null){
            repartitor= new Repartitor(); //lazy initilization
        }

        return repartitor;
    }

}
