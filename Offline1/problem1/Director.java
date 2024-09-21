package problem1;

public class Director {
    IBuilder myBuilder; 
    public void ProduceTicket(IBuilder builder, String pack, String connection, String framework){
        myBuilder = builder; 
        myBuilder.BuildPackage(pack);
        myBuilder.BuildConnection(connection);
        myBuilder.BuildFramework(framework);
    }
}
