package UseEnum;
public class Test {
    public static void main(String[] args) 
    {
        for (EnumTest e : EnumTest.values())
        {
            System.out.println(e.toString());
        }
         
        System.out.println("----------------���Ƿָ���------------------");
         
        EnumTest test = EnumTest.TUE;
        
        switch (test) {
        case MON:
            System.out.println("����������һ");
            break;
        case TUE:
            System.out.println("���������ڶ�");
            break;
        // ... ...
        default:
            System.out.println(test);
            break;
        }
    }
}
