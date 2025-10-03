class MyFirstClass {
	public static void main(String[] s) {
		int i, j;
		i=0;
		j=0;
		MySecondClass o = new MySecondClass(i,j);
    		
    		for (i = 1; i <= 8; i++) {
        		for(j = 1; j <= 8; j++) {
            			o.set_i(i);
            			o.set_j(j);
            			System.out.print(o.ymnoj());
            			System.out.print(" ");
        		}
			System.out.println();
		}
	}
}


class MySecondClass {
	int i,j;
	public int get_i(){
		return i;
	}
	public int get_j(){
		return j;
	}
	public void set_i(int x){
		i=x;
	}
	public void set_j(int x){
		j=x;
	}
	public MySecondClass(int x, int y){
		i=x;
		j=y;
	}
	public int ymnoj(){
		return i*j;
	}

}
