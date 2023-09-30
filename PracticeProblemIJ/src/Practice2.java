class Practice2 {

    public static void praveen() {
        System.out.println("praveen is master in tech");
    }
    public static void main(String[] args) {
        int[][] a=new int[5][];
        for (int i=0; i<a.length; i++){
            a[i]=new int[i+1];
            for (int j=0; j<a[i].length; j++){
                a[i][j]=i+j;
            }
        }
        for (int[] i : a) {
            for (int k : i) {
                System.out.print(k);

            }
            System.out.println();
        }
    }
}
