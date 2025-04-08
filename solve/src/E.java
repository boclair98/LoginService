class E {
    static int sum = 0;
    int data;

    public static void main(String[] args) {
        E e = new E();
        int data = 0;
        int sum = 0;
        while (data<=10){
            sum+=data;
            data++;
        }
        System.out.println(data+" "+e.sum);
    }
}