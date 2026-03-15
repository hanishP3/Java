public class ConstructerSam {

    int staticCount = 0;
    ConstructerSam(int inp){
        this.staticCount = staticCount+inp;
    }
    public static void main(String[] args) {
        System.out.println("hanish");
    ConstructerSam obj = new ConstructerSam(78);
    System.out.println(obj);
    }
}
