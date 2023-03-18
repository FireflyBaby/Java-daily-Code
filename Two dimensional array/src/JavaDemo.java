public class JavaDemo {
    public static void main(String[] args) {
        int data[][]=new int[][]{{1,2,3,4,5},{6,7,8,13},{9,10,11,12}};
        for (int temp[]:data){
            for (int num:temp){
                System.out.print(num+"、");
            }
            System.out.println();
        }



    }
}

