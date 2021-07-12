package sequality;
public class Calculate {
    public int sum(int x, int y) {
        return x + y;
    }
    public double average(int x,int y){
        double s;
        s = (double)(x+y)/2;
        return s;
    }
    public double totalaverage(int x,int y){
        double s=0;
        for(int i=x;i<=y;i++){
            s += i;
        }
        s=(double)s/y;
        return s;
    }
    public int total(int x,int y){
        int s=0;
        for(int i=x;i<=y;i++){
            s += i;
        }
        return s;
    }
    public int oddtotal(int x,int y){
        int s=0;
        for(int i=x;i<=y;i++){
            if (i%2!=0){s += i;}
        }
        return s;
    }
    public int eventotal(int x,int y){
        int s=0;
        for(int i=x;i<=y;i++){
            if (i%2==0){s += i;}
        }
        return s;
    }
}