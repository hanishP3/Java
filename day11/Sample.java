class DataJar<t>{
    private t content;
    DataJar( t  content){
        this.content = content;
    }
    public t getContext(){
        return content;
    }

}

public class Sample{
    public static void main(String[] args) {
        DataJar<String>  myobj = new DataJar(" Message");
        System.out.println(myobj.getContext());

        DataJar<Integer> myobj2 = new DataJar(4);
        System.out.println(myobj2.getContext());
    }
}